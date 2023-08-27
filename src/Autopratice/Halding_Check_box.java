package Autopratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Halding_Check_box {

	public static void main(String[] args) {
		WebDriver driver= new  ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// this is for only one check box
		WebElement e=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		e.click();
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		System.out.println(e.isSelected());
		
		// this is for all check box at once
		List<WebElement> L=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//this is first approach
		for (WebElement k:L)
		{
			k.click();
		}
		// this is second approach
		for (int i=0; i<L.size(); i++)
		{
			L.get(i).click();
		}
		
		
		
	}

}
