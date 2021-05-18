package classWork;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P01Usecase {

	@Test
	public  void createLead() {
		// TODO Auto-generated method stub

	
	
	WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
	driver.navigate().to ("http://iarchtaps.com:8080/opentaps/control/main/");
		// driver.get(baseUrl);
		 driver.manage().window().maximize();
			
//	 Actions action = new Actions(driver);

		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		 action.sendKeys(Keys.TAB).build().perform();
		
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
	 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 
		 
		 driver.findElementByXPath("//input[@name='companyName']").sendKeys("Instagram");
		 driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("Nancy");
		 driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys("Clarence");
		 driver.findElement(By.xpath("(//input[@name='primaryPhoneAreaCode'])[3]")).sendKeys("459");
		 driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[3]")).sendKeys("2345");
		 driver.findElement(By.xpath("(//input[@name='primaryEmail'])[3]")).sendKeys("nancyclarence@gmail.com");
	
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)");
		  driver.findElement(By.xpath("//button[contains(text(),'Create Lead')]")).click();
		  
		
		//	 driver.close();
		 

	}
	

	



	}


