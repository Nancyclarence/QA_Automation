package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class InterfaceWrapper {

	public RemoteWebDriver driver;
	public void invokeBrowser(String browser,String url){

		if(browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		System.out.println("the browser"+browser+"launched successfully");

	}
	public WebElement locSelector(String selType, String selValue) {

		switch (selType.toLowerCase()) {
		case "id": return driver.findElement(By.id(selValue));
		case "class": return driver.findElement(By.className(selValue));
		case "link": return driver.findElement(By.linkText(selValue));
		case "xpath": return driver.findElement(By.xpath(selValue));
		case "name": return driver.findElement(By.name(selValue));
		case "partialLinkText": return driver.findElement(By.partialLinkText(selValue));
		case "cssSelector": return driver.findElement(By.cssSelector(selValue));
		case "tagName": return driver.findElement(By.tagName(selValue));

		}
		return null;

	}
	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" clicked Successfully");
	}
	//		 File scr = driver.getScreenshotAs(OutputType.FILE);
	//		 File des = new File("./snaps/1.png");
	//		 FileUtils.copyFile(scr, des);

	public void append(WebElement ele, String data) {
		ele.sendKeys(data);

		System.out.println("The Element "+data+" send Successfully");

	}
	public void clear(WebElement ele) {
		ele.clear();
		System.out.println("The Element "+ele+" cleared Successfully");

	}
	public void clearAndType(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("The Data "+data+" entered Successfully");
	}

}


