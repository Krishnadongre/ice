package Keyboard_mouse_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_operation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Actions a=new Actions(driver);
		
		WebElement e=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Thread.sleep(1000);
		
		a.clickAndHold(e).build().perform();
		Thread.sleep(2000);
		a.moveToElement(e, 100, 100).build().perform();
		//action.moveByOffset(200, 300);		
		Thread.sleep(2000);
		a.release().build().perform();
		
		
		
		
		

	}

}
