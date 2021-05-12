package classWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P04UseCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		driver.navigate().to ("http://iarchtaps.com:8080/opentaps/control/main/");
			// driver.get(baseUrl);
			 driver.manage().window().maximize();


			 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//			 action.sendKeys(Keys.TAB).build().perform();
			
			 driver.findElement(By.id("password")).sendKeys("crmsfa");
			 
			 driver.findElement(By.className("decorativeSubmit")).click();
			 
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 driver.findElement(By.linkText("Leads")).click();
			 driver.findElement(By.linkText("Find Leads")).click();
			 driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
			 driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("459");
			 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("2345");
			 
			 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			 Thread.sleep(2000);

			 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click(); 
			 driver.findElementByClassName("subMenuButtonDangerous").click();
			 driver.findElement(By.linkText("Find Leads")).click();
			 driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10217");
			 
			 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			 
			 driver.close();
	}
	

}
