package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsWithAttribute {

	public static void main(String[] args) throws InterruptedException 
	
	{
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,'forg')]")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[contains(text(),'Use Custom')]")).click();

	}

}
