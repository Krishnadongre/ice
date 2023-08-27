package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait_Globalwait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("krish");
		
		WebElement passward=driver.findElement(By.xpath("//input[@id='password']"));
		passward.sendKeys("krish@1996");
		
		Thread.sleep(2000);
    	try
		{
			username.sendKeys("krish");
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("krish");
	      System.out.println("handle the stale reference exception successfully");
			
		}
		
		
		
		

	}

}
