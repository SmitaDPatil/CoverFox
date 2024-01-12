package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpStudy {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("submit")).click();
		
		//Handling alert pop-up
		
		 Alert alt = driver.switchTo().alert();
		 
		 //if i want to click on ok button on alert
		 
		 Thread.sleep(2000);
		 
		 alt.dismiss();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("cusid")).sendKeys("12345");
		
		

	}

}
