package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class P02UseCase {
	@Test(invocationCount=2,threadPoolSize=2)
	public  void merge() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		String baseUrl = "http://iarchtaps.com:8080/opentaps/control/main/";
		 driver.get(baseUrl);
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		
		 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Nancy");
		
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 
		 Thread.sleep(2000);

	 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click(); 
	       
	 driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	 driver.findElement(By.id("updateLeadForm_companyName")).clear();
	 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");
	 
	 driver.findElement(By.xpath("//input[@value='Update']")).click();
		
// driver.close();	
}
}
