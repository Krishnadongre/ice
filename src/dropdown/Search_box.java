package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_box {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("//input[@id='autosuggest']"));
		e.click();
		
		//this is not good approach
		e.sendKeys("ind");
	     Thread.sleep(2000);
	     
	     e.sendKeys(Keys.ARROW_DOWN);
	     Thread.sleep(1000);
	     
	     e.sendKeys(Keys.ARROW_DOWN);
	     Thread.sleep(1000);
	     
	     e.sendKeys(Keys.ENTER);
	     Thread.sleep(1000);
	     
	     //by using for loop
		  List<WebElement> a=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		  for (WebElement k:a)
		  {
			  if(k.getText().equalsIgnoreCase("india"))
			  {
					k.click();
					break;
				}
		  }
	     
	}
}



