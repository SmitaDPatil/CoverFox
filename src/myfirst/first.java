package myfirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(1000);
		
		
		//driver. manage().window().minimize();
		
		
		//driver.close();
		
	}

}
