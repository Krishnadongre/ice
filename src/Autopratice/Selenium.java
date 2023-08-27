package Autopratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000); //stop for some time
		
		driver.manage().window().maximize(); // to maximize window
		
		String s=driver.getCurrentUrl();     //to get currant url on console
		System.out.println(s);
		
		//System.out.println(driver.getTitle()); this two approach to get title of web page
		String s1=driver.getTitle();
		System.out.println(s1);
		
		driver.navigate().to("https://www.instagram.com/");  //to navigate from one page to another
	
		String s3=driver.getCurrentUrl();  //to get currant url on console
		System.out.println(s3);
		
		String s4=driver.getTitle();   //to get title of web page
		System.out.println(s4);
		
		driver.navigate().back(); //navigate from currant webpage to previous page
		
		driver.navigate().forward(); //navigate from currant webpage to next page
		
		driver.navigate().refresh(); //refresh currant webpage
		
		driver.close(); //close the currant webpage
		
		
	
		
		

	}

}
