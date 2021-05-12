package classWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		String baseUrl = "https://www.jqueryui.com/";
		 driver.get(baseUrl);
		 driver.manage().window().maximize();
		 
		 driver.findElementByLinkText("Selectable").click();
		/** Using index**/
		
		 driver.switchTo().frame(0);
		/** using webelement**/
		 WebElement ele=driver.findElementByClassName("demo-frame");
		 driver.switchTo().frame(ele);
		 
		 driver.findElementByXPath("//li[text()='Item 1']").click();
		 
		 driver.switchTo().defaultContent();
		 driver.findElementByLinkText("Download").click();
		 
		

		 
		 
		 
//		 int size = driver.findElements(By.tagName("iframe")).size();
//		 System.out.println(size);
//		 
//		 driver.switchTo().frame("google_ads_iframe_/24132379/guru99.com_300x600_sticky_0"); //switching the frame by ID
//
//			System.out.println("********We are switch to the iframe*******");
//  		driver.findElement(By.xpath("html/body/a/img")).click();
//		    //Clicks the iframe
//    
//			System.out.println("*********We are done***************");
//			
			
	}

}
