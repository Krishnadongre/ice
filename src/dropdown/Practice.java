package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//input[@id='autosuggest']"));
		
		Thread.sleep(2000);
		
		e.sendKeys("ind");
		
//		e.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		e.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		e.sendKeys(Keys.ARROW_DOWN);
//		e.sendKeys(Keys.ENTER);
		
		List<WebElement> a=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for (WebElement k:a)
		{
			if (k.getText().equalsIgnoreCase("inida"));
			{
				k.click();
				break;
			}
		}
		
	
	}
}
		
		