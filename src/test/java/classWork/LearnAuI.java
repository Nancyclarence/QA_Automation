package classWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAuI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		driver.navigate().to ("https://www.jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.switchTo().frame(0);
		WebElement draggable=driver.findElementById("draggable");
		WebElement droppable=driver.findElementById("droppable");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();
		

	}

}
