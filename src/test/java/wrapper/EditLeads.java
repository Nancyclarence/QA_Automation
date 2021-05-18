package wrapper;

import org.testng.annotations.Test;

public class EditLeads extends ProjectspecificClass {
	
	@Test
	public void findLead() throws InterruptedException {
  
	click(locSelector("link", "Leads"));
	click(locSelector("link", "Find Leads"));
	clearAndType(locSelector("xpath", "(//input[@name='firstName'])[3]"),"Nancy");
	click(locSelector("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);
		click(locSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locSelector("xpath", "//a[contains(text(),'Edit')]"));
		clearAndType(locSelector("id", "updateLeadForm_companyName"),"Google");
		click(locSelector("xpath", "//input[@value='Update']"));
		closeApp();
		
		
}
}
