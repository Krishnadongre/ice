package window_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scroll_Down_Handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver.
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scrolldown by using pixel
		js.executeScript("window.scrollBy(0,1000)", "");
		
		//scrolling until specific element found
		WebElement e=driver.findElement(By.xpath("//button[@id='mousehover']"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		
		//Scrolling upto end  
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
         
		

	}

}
