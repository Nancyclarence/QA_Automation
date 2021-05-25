package wrapper;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLeads extends ProjectspecificClass {
	
	@BeforeTest
	public void setData() {
		TestCaseNAme="TC001_CreateLead";
		TestCaseDesc = "Create the new Lead in OpenTaps";
		Author = "Anish Shash";
		Category = "Smoke";
		Device = "Mac";
		dataSheet = "TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String cName, String fName, String lName) {
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Create Lead"));
		clearAndType(locSelector("id", "createLeadForm_companyName"),cName);
		clearAndType(locSelector("id", "createLeadForm_firstName"),fName);
		clearAndType(locSelector("id", "createLeadForm_lastName"),lName);
		selectDropDownUsingText(locSelector("id", "createLeadForm_dataSourceId"), "Website");
		click(locSelector("name", "submitButton"));
	}

}
	
	
	
	



