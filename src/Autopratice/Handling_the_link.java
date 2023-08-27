package Autopratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_the_link {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//link text
		//WebElement e=driver.findElement(By.linkText("Gmail"));
		//System.out.println(e.isDisplayed());
		//System.out.println(e.isEnabled());
		//System.out.println(e.getText());
		
		//e.click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
		//partial link 
		WebElement e1=driver.findElement(By.partialLinkText("Gma"));
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
		System.out.println(e1.getText());
		e1.click();
		
  		driver.navigate().back();
	    driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		

	}

}
