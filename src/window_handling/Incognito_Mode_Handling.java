package window_handling;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class Incognito_Mode_Handling {

		public static void main(String[] args) throws InterruptedException {
			
			// ctrate object fr ChromeOptions
			
			ChromeOptions options=new ChromeOptions();
			
			// add argument
			
			options.addArguments("--incognito");
			
			WebDriver driver=new ChromeDriver(options);
			
			 driver.get("https://login.salesforce.com/?locale=in");
		      
		      driver.manage().window().maximize();
		      
		      Thread.sleep(3000);
		      
		      driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys("sharad");
		      
		      Thread.sleep(3000);
		      
		      driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).sendKeys("sharad1999");
		      

		}



}
