package classWork;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;




public class LearnAnnotations {
   @BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
   @BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
   @BeforeClass
   public void beforeClass() {
		System.out.println("BeforeClass");
	}
   @BeforeMethod
   public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
   @AfterMethod
   public void afterMethod() {
		System.out.println("AfterMethod");
	}
   @AfterClass
   public void afterClass() {
		System.out.println("Afterclass");
	}
   @AfterSuite
   public void afterSuite() {
		System.out.println("AfterSuite");
	}
   @AfterTest
   public void afterTest() {
		System.out.println("AfterTest");
	}
     
   @Test(dataProvider = "getData")
	public void test1(String data) {
		System.out.println("Test1: "+data);
	}
	

	@DataProvider
	public String[][] getData() {
		System.out.println("DataProvider");
		String[][] data = new String[1][1];
		data[0][0] = "xyz";
		return data;
	}
}