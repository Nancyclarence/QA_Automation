package wrapper;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider extends ProjectspecificClass {

	@Test(dataProvider="fetchdata")
	public void createLead(String cname, String fname,String lname) {
		
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Create Lead"));
		clearAndType(locSelector("id", "createLeadForm_companyName"),cname);
		clearAndType(locSelector("id", "createLeadForm_firstName"),fname);
		clearAndType(locSelector("id", "createLeadForm_lastName"),lname);
		click(locSelector("name", "submitButton"));

}
//	@DataProvider(name="fetchdata")
//	public String[][] getData() throws IOException {
//		ReadExcel rd=new ReadExcel();
//		 return rd.readExcel();
//	}

	}
