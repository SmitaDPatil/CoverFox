package crossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTest {
	@Parameters("bName")
  @Test
  public void f(String browserName) throws InterruptedException
	{
		
		WebDriver driver=null;
		
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("fireFox"))
		{
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
	  	
	  	driver.get("https://www.facebook.com/");
	  	Thread.sleep(500);
	  	
	  	driver.findElement(By.linkText("Create new account")).click();
	  	
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  	
	  	driver.findElement(By.name("firstname")).sendKeys("Smita");
	  	
	  	driver.findElement(By.name("lastname")).sendKeys( "Patil");
	  	
	  	driver.findElement(By.name("reg_email_")).sendKeys( "7227999394");
	  	
	  	Thread.sleep(4500);
	  	
	  	driver.close();
	    }
  }
	

