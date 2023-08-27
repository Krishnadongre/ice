package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passanger {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		e.click();
		
		WebElement e1=driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		e1.click();
		e1.click();
		e1.click();
     	
		
//		//by using for loop
//		for (int i=0; i<=3; i++)
//		{
//			driver.findElement(By.xpath("//span[@id='hrefIncAdt")).click();
//		}
		
		//for child dropdown
		WebElement e2=driver.findElement(By.xpath("//span[@id='hrefIncChd']"));
		e2.click();
		e2.click();
		e2.click();
		e2.click();
		
		//for infant dropdown
		WebElement e3=driver.findElement(By.xpath("//span[@id='hrefIncInf']"));
		e3.click();
		e3.click();
		e3.click();
		e3.click();
		
		
	
		
		
		
		
		


	}

}
