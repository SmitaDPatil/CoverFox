package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersStudy {

	public static void main(String[] args) throws InterruptedException
	{
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.foundit.in/");
		
		Thread.sleep(1000);
		
	driver.findElement(By.xpath("//a[@data-check=\"menutab\"]")).click();	
	
}
}