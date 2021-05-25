package wrapper;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectspecificClass extends GenericWrapper {


	public String dataSheet;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Parameters({"url", "uname", "pwd"})
	@BeforeMethod
	public void login(String url, String Username, String password) {
		node = Test.createNode(TestCaseNAme);
		invokeBrowser("chrome", url);
		clearAndType(locSelector("id", "username"), Username);
		clearAndType(locSelector("id", "password"), password);
		click(locSelector("class", "decorativeSubmit"));
		click(locSelector("link", "CRM/SFA"));	
	}
	
	@AfterMethod
	public void closeApp() {
		close();
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
		ReadExcel rd = new ReadExcel();
		return rd.readExcel(dataSheet);
	}

}
	
	

	 
 
