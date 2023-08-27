package window_handling;
import org.openqa.selenium.By;
//this program is for to hide the executions 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Operation {

	public static void main(String[] args) throws InterruptedException {
		//create an object for Chromeoptions
		ChromeOptions options=new ChromeOptions();

		// add the headless argument
		options.addArguments("headless");
		
		// pass the options parameter inside chromeDriver argument
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']"));
		username.click();
		username.sendKeys("krish");
		Thread.sleep(2000);
		driver.getCurrentUrl();
		
		
		
		
		

	}

}
