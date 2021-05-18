package wrapper;

import org.testng.annotations.Test;

public class CreateLeads extends ProjectspecificClass {
	
	@Test
	public void createLead() {
		
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Create Lead"));
		clearAndType(locSelector("id", "createLeadForm_companyName"),"TCS");
		clearAndType(locSelector("id", "createLeadForm_firstName"),"Nancy");
		clearAndType(locSelector("id", "createLeadForm_lastName"),"Clarence");
		click(locSelector("name", "submitButton"));
		

	}

}

