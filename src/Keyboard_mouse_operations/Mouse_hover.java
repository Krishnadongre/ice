package Keyboard_mouse_operations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.unipune.ac.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement e=driver.findElement(By.xpath("//span[@id='stUI42_txt']"));
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("//span[@id='stUI185_txt']"));
		Thread.sleep(1000);
		WebElement e2=driver.findElement(By.xpath("//td[@id='stUI195_cnt']"));
		Thread.sleep(1000);
		WebElement e3=driver.findElement(By.xpath("//span[@id='stUI216_txt']"));
		Thread.sleep(1000);
		WebElement e4=driver.findElement(By.xpath("//span[@id='stUI230_txt']"));
		Thread.sleep(1000);
		WebElement e5=driver.findElement(By.xpath("//span[@id='stUI254_txt']"));
		Thread.sleep(1000);
		WebElement e6=driver.findElement(By.xpath("//span[@id='stUI278_txt']"));
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(1000);
		a.moveToElement(e1).build().perform();
		Thread.sleep(1000);
		a.moveToElement(e2).build().perform();
		Thread.sleep(1000);
		a.moveToElement(e3).build().perform();
		Thread.sleep(1000);
		a.moveToElement(e4).build().perform();
		Thread.sleep(1000);
		a.moveToElement(e5).build().perform();
		Thread.sleep(1000);
	    a.moveToElement(e6).build().perform();
	
		Thread.sleep(1000);
		
		WebElement content=driver.findElement(By.xpath("//span[@id='stUI283_txt']"));
		Thread.sleep(1000);
		
		content.click();
		driver.close();
		
		
		
		
		
				
		
		
		
		
		
	}

}
