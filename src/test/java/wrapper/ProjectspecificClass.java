package wrapper;

public class ProjectspecificClass extends GenericWrapper {
 public void Login() {
 invokeBrowser("chrome", "http://iarchtaps.com:8080/opentaps/control/main");
	clearAndType(locSelector("id", "username"),"DemoSalesManager");
	clearAndType(locSelector("id", "password"),"crmsfa");
	click(locSelector("class", "decorativeSubmit"));
	click(locSelector("link", "CRM/SFA"));

}
 public void closeApp() {
		driver.close();
	}
	 
	 
 }
