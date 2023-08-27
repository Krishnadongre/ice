package window_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement calender=driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']"));
		calender.click();
		Thread.sleep(1000);
		
		List<WebElement> obj=driver.findElements(By.xpath("//td[@data-month='6']"));
		Thread.sleep(1000); 
		for(WebElement k:obj)
		{
			if(k.getText().equalsIgnoreCase("28"))
			{
				k.click();
				break;
			}
		}
		driver.close();
		
		}
		}


