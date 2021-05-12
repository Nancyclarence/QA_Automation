package wrapper;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MergeLead extends ProjectspecificClass {
	@Test
	public void mergeLeads() throws InterruptedException {
		Login();
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Merge Leads"));
		click(locSelector("xpath", "//span[contains(text(),'From Lead')]/following::img[1]"));
		switchToWindow(1);
		String sText = getElementText(locSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		click(locSelector("xpath", "//span[contains(text(),'From Lead')]/following::img[2]"));
		switchToWindow(1);
	//	clearAndType(locSelector("xpath","//input[@name='id']"),"10166");
	//	click(locSelector("xpath","//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);	
		 sText = getTypedText(locSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a"));
		click(locSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a"));
		switchToWindow(0);
		click(locSelector("link", "Merge"));
		acceptAlert();
		click(locSelector("link", "Find Leads"));
		clearAndType(locSelector("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), sText);
		click(locSelector("xpath", "//button[contains(text(),'Find Leads')]"));
		verifyPartialText(locSelector("xpath", "//div[@class='x-paging-info']"), "No records to display");
		closeApp();	
	}
}

