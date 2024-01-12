package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyIndex {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://m.redbus.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("pune");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("kolhapur");
		
		

	}

}
