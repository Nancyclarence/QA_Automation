package classWork;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
		
		@Test
		public void CreateLead(){
			System.out.println("CreateLead");
			throw new RuntimeException();
		}
		@Test(dependsOnMethods="CreateLead",alwaysRun=true)
		public void DeleteLead(){
			System.out.println("DeleteLead");
		}
		@Test (enabled=false)
		public void EditLead(){
			System.out.println("EditLead");
		}@Test(priority=-4)
		public void MergeLead(){
			System.out.println("MergeLead");
		}

	}


