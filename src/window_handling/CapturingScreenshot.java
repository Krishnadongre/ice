package window_handling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        Thread.sleep(2000);
        
        //for full screenshot
        File a=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(1000);
        FileUtils.copyFile(a, new File("C:\\Users\\Krishna\\Desktop\\New folder\\test.jpeg"));
        
        Thread.sleep(2000);
        
       //for partial screen shot
        WebElement e=driver.findElement(By.xpath("//*[@id=\\\"mainContent\\\"]/div[4]/div/form/table/tbody/tr[4]/td[1]/strong"));
        File a1=e.getScreenshotAs(OutputType.FILE);
        Thread.sleep(1000);
        FileUtils.copyFile(a1, new File("C:\\\\Users\\\\Krishna\\\\Desktop\\\\New folder\\test.png"));
        
       WebElement e1=driver.findElement(By.xpath("//div[@class='col-sm-12 col-md-8 col-xl-6 rounded-3 tutorial-content']"));
       File a2=e1.getScreenshotAs(OutputType.FILE);
       Thread.sleep(2000);
       FileUtils.copyFile(a2, new File("C:\\\\Users\\\\Krishna\\\\Desktop\\\\New folder\\test.png"));
       
       
        

	}

}
