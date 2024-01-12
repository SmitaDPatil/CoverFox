package misc;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1_Scrolling {

	public static void main(String[] args) throws IOException
	
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://ttdevasthanams.ap.gov.in/home/dashboard");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
   CommanlyUsedMethod.implicitwait(driver, 10);
   WebElement termsconditions = driver.findElement(By.xpath("//span[text()='Terms and conditions']"));
   
   CommanlyUsedMethod.scrollIntoView(driver, termsconditions);
   CommanlyUsedMethod.takeScreenshot(driver, "TTDEG");
   		
   
	}

}
