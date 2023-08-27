package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_drop_down {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		e.click();
		
		//create the select class
		Select s=new Select(e);
		s.selectByIndex(1);
		s.selectByValue("AED");
		s.deselectByVisibleText("INR");
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
