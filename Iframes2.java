package assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		String baseUrl = "http://layout.jquerydev.com/demos/iframe_local.html";
		 driver.get(baseUrl);
		 driver.manage().window().maximize();
		
		WebElement ele=driver.findElementById("childIframe");
		driver.switchTo().frame(ele);
    	
		driver.findElementByXPath("//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west']/p/button").click();
	    Thread.sleep(2000);
		driver.findElementByXPath("//div[contains(text(),'Iframe East')]/p/child::button").click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElementByXPath("//h3[text()='Close/Toggle Iframe-West']/parent::div/child::p/child::button").click();
		
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']/p/child::button").click();

	}

}
