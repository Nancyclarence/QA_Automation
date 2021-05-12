package classWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class P05UseCase {
	public static void main(String[] args) throws InterruptedException, IOException {
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
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Set<String>  CurrentWindow=driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(CurrentWindow);
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10160");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click(); 
		Thread.sleep(2000);	
		CurrentWindow=driver.getWindowHandles();
		lst=new ArrayList<String>(CurrentWindow);
		driver.switchTo().window(lst.get(0));
		driver.findElement(By.xpath("(//img[contains(@src,'/images/fieldlookup.gif')])[2]")).click();
		CurrentWindow=driver.getWindowHandles();
		lst=new ArrayList<String>(CurrentWindow);
		driver.switchTo().window(lst.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10166");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click(); 
		Thread.sleep(2000);	
		CurrentWindow=driver.getWindowHandles();
		lst=new ArrayList<String>(CurrentWindow);
		driver.switchTo().window(lst.get(0));
		driver.findElementByClassName("buttonDangerous").click();
		driver.switchTo().alert().accept();
		driver.close();


	}

}
