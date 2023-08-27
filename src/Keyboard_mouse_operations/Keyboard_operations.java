package Keyboard_mouse_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_operations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(2000);
		
		WebElement Fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement Lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		Thread.sleep(2000);
		
		Fname.sendKeys("krishna");
		Thread.sleep(1000);
		Fname.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		Fname.sendKeys(Keys.CONTROL + "c");
		Thread.sleep(1000);
		Fname.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Lname.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(1000);
		Lname.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		Lname.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		Lname.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(1000);
		Lname.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(1000);
		Lname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(1000);
		Lname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(1000);
		Lname.sendKeys("dongre");
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		

	}

}
