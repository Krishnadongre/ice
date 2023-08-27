package window_handling;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement openwindow=driver.findElement(By.xpath("//button[@id='openwindow']"));
		openwindow.click();
		

		Set<String> obj=driver.getWindowHandles();
		java.util.Iterator<String> it=obj.iterator();
		
		String parent_window=it.next();
		String child_window=it.next();
		
		Thread.sleep(2000);
		
		//control on child page
		driver.switchTo().window(child_window);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='about.html']")).click();
		
		//control on parent page
		driver.switchTo().window(parent_window);
		System.out.println(driver.getCurrentUrl());
		
		//control on child page
		driver.switchTo().window(child_window);
		driver.quit();
		
		
		
		
		
		
		
	

	}

}
