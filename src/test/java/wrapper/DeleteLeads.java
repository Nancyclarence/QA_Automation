package wrapper;

import org.testng.annotations.Test;

public class DeleteLeads extends ProjectspecificClass {
	@Test
	public void deleteLead() throws InterruptedException {
  
    click(locSelector("link", "Leads"));
	click(locSelector("link", "Find Leads"));
	click(locSelector("xpath", "//span[contains(text(),'Phone')]"));
	clearAndType(locSelector("xpath", "//input[@name='phoneAreaCode']"),"459");
	clearAndType(locSelector("xpath", "//input[@name='phoneNumber']"),"2345");
	click(locSelector("xpath", "//button[contains(text(),'Find Leads')]"));
	 Thread.sleep(2000);
	 click(locSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	 click(locSelector("class", "subMenuButtonDangerous"));
	 click(locSelector("link", "Find Leads"));
	 clearAndType(locSelector("xpath","//input[@name='id']"),"10217");
	 click(locSelector("xpath", "//button[contains(text(),'Find Leads')]"));
	
}
}