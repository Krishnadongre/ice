package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		e.click();
		
		Thread.sleep(3000);
		
		WebElement e1=driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		e1.click();
		e1.click();
		e1.click();
		e1.click();
		e1.click();
		e1.click();
		e1.click();
		e1.click();
		e1.click();
		
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.switchTo().alert().getText());
		//second approach to print the text
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
			
		
		//driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		driver.close();
		
		


	
	
		
		
		
	}
}
		
		
		
		

		
	
		
		

	


