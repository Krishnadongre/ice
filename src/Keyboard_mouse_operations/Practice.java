package  Keyboard_mouse_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		
		fname.sendKeys("krish");
		fname.sendKeys(Keys.CONTROL + "a");
		fname.sendKeys(Keys.CONTROL + "c");
		fname.sendKeys(Keys.TAB);
		lname.sendKeys(Keys.CONTROL + "v");
		lname.sendKeys(Keys.BACK_SPACE);
		lname.sendKeys(Keys.BACK_SPACE);
		lname.sendKeys("shna");
		lname.sendKeys(Keys.SPACE);
		lname.sendKeys("dongre");
		driver.close();
		
		
		
		
			
		
		
		

}

}