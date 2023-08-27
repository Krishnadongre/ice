package Keyboard_mouse_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_mutiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		WebElement e=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default']) [2]"));
		Thread.sleep(1000);
		WebElement e2=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]"));
        
		Thread.sleep(2000);
		
        Actions a=new Actions(driver);
        Thread.sleep(2000);
        a.clickAndHold(e).moveByOffset(100, 0).release().build().perform();
        Thread.sleep(1000);
        a.clickAndHold(e1).moveByOffset(100, 0).release().build().perform();
        Thread.sleep(1000);
        a.clickAndHold(e2).moveByOffset(100, 0).release().build().perform();
        
        driver.close();
        
        
        

	}

}
