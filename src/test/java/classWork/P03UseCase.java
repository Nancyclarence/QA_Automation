package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P03UseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl = "http://iarchtaps.com:8080/opentaps/control/main/";
		 driver.get(baseUrl);
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
		  
		 
	 		 driver.findElement(By.linkText("CRM/SFA")).click();
	 		 driver.findElement(By.linkText("Leads")).click();
	 		driver.findElement(By.linkText("Create Lead")).click(); 
	 		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Instagram");
	 		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nancy");
	 		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("clarence");
	 		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Frank");
	 		
	 		WebElement Sourc =driver.findElement(By.id("createLeadForm_dataSourceId"));
	 		Select drp= new Select(Sourc);
			 drp.selectByValue("LEAD_SELFGEN");
	 
			 WebElement Market= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			 Select mrk= new Select(Market);
	         mrk.selectByVisibleText("Demo Marketing Campaign");
			 
	         driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Clar"); 
			 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/8/21"); 
	 
		  WebElement Indus =driver.findElement(By.id("createLeadForm_industryEnumId"));
		  Select Indd= new Select(Indus);
		  Indd.selectByIndex(3);
		
		  Select drp3= new Select(driver.findElement(By.id("createLeadForm_currencyUomId")));
		 drp3.selectByVisibleText("CAD - Canadian Dollar");
		 
		 
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Eng"); 

	}

}
