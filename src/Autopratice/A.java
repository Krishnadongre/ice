package Autopratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
	    Thread.sleep(3000);
	    
	    d.manage().window().maximize();
	    
	    System.out.println(d.getCurrentUrl());
	    
	    System.out.println(d.getTitle());
	    
	    WebElement e=d.findElement(By.className("gLFyf"));
	    
	    e.click();
	    
	    Thread.sleep(3000);
	    
	    e.sendKeys("s square it, pune");
	    
	    Thread.sleep(3000);
	    
	    
	    WebElement e1=d.findElement(By.className("gNO89b"));
	    
	    e1.click();
	    
	    System.out.println(d.getCurrentUrl());
	    
	    Thread.sleep(3000);
	    
	    d.navigate().back();
	    
	    Thread.sleep(3000);
	    
	    d.navigate().forward();
	    
	    d.navigate().refresh();
	    
	    d.close();
	    
	    

	}

}