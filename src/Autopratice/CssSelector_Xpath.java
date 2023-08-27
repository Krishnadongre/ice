package Autopratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
        //by using CssSelector syntax = tagname[arribute ='value']
		WebElement e=driver.findElement(By.cssSelector("a[id='forgot_password_link']"));
        e.click();
        
        //by using Xpath syntax = //tagname[@attribute='value']
        WebElement e1=driver.findElement(By.xpath("//input[@id='un']"));
        e1.click();
        e1.sendKeys("krish");
        
        //by using  parent/child Xpath = //parenttagename[@attribute='value']/childtagname 
        WebElement e2=driver.findElement(By.xpath("//div[@class='verifyform']/label"));
        e2.click();
  
        
        
        
        
        
        
		
		
		
		

	}

}
