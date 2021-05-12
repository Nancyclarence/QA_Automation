package classWork;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P06USeCase {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		String baseUrl = "http://iarchtaps.com:8080/opentaps/control/main/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("shalini@xyz.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		File scr = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/2.png");
		FileUtils.copyFile(scr, des);

		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click(); 

		driver.findElementByLinkText("Duplicate Lead").click();
		System.out.println(driver.getTitle());
		String expectedTitle = "Duplicate Lead | opentaps CRM";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.findElementByXPath("//input[contains(@value,'Create Lead')]").click();
		
		driver.close();
	}

}
