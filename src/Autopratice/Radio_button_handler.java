package Autopratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button_handler {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	     driver.manage().window().maximize();
	     
	     System.out.println(driver.getCurrentUrl());
	     System.out.println(driver.getTitle());
	     
	     //identifying male element
	     WebElement e=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[1]"));
	     
	     //identifying female element
	     WebElement e1=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[2]"));
    
	     //operations on male button
	     e.click();
	     System.out.println(e.isDisplayed());  //check for displayed or not
	     System.out.println(e.isEnabled());  // check enabled or not
	     System.out.println(e.isSelected());  // check selected or not
	     System.out.println(e.getText());     // print text name
	     
	     //operations on female button
	     e1.click();
	     System.out.println(e1.isDisplayed());
	     System.out.println(e1.isEnabled());
	     System.out.println(e1.isSelected());
	     System.out.println(e1.getText());
	     
	     driver.close();
		

	}

}
