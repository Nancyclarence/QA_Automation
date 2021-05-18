package wrapper;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectspecificClass extends GenericWrapper {

@Parameters({"url","uname","pwd"})
@BeforeMethod
	public void Login(String url, String username, String password) {
    invokeBrowser("chrome", url);
	clearAndType(locSelector("id", "username"),username);
	clearAndType(locSelector("id", "password"),password);
	click(locSelector("class", "decorativeSubmit"));
	click(locSelector("link", "CRM/SFA"));

}
@AfterMethod
   public void closeApp() {
		driver.close();
	}
	 
	 
 }
