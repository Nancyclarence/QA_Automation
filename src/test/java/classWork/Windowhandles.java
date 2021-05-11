package classWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		driver.navigate().to ("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)");
		  
		  
		  driver.findElementByXPath("//a[contains(@href,'tryit.asp?filename=tryjs_confirm')]").click();
		 
			 Set<String>  CurrentWindow=driver.getWindowHandles();
			 List<String> lst=new ArrayList<String>(CurrentWindow);
			
			 driver.switchTo().window(lst.get(1));
			 
			 System.out.println(driver.getTitle());
			 driver.findElementById("tryhome").click();
			 
			 CurrentWindow=driver.getWindowHandles();
			 lst=new ArrayList<String>(CurrentWindow);
			 driver.switchTo().window(lst.get(2));
			 System.out.println(driver.getTitle());

	}

}
