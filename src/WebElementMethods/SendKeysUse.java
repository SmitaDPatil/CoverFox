package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException 
	
	{
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Velocity@vctcpune.com");
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Velocity123@vctcpune.com");
		
		//locater-->id
		
		//driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
		
		//locater-->name
		
		driver.findElement(By.id("email")).sendKeys("Testing@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).clear();
				
				
		
		

	}

}
