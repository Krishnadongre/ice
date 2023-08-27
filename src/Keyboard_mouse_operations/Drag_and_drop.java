package Keyboard_mouse_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		WebElement sourceelement=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetelement=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		
		a.clickAndHold(sourceelement).moveToElement(targetelement).release().build().perform();
		
		driver.close();
		
		

	}

}
