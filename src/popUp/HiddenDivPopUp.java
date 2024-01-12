package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopUp {

	public static void main(String[] args) throws InterruptedException
	
	{
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			Thread.sleep(2000);
			
			//handle --> hidden division pop-up
			
			driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("q")).sendKeys("shoes");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			

	}

}
