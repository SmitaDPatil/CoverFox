package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(2000);
		
		String expResult="Find your dream job now";
		
		String actualResult=driver.findElement(By.className("qsb-title")).getText();
		
		System.out.println(actualResult);
		
		if(expResult.equals(actualResult))
			
		{
			System.out.println("Text is matching, TC is passed");
			
		}
		
		else {
			
			System.out.println("Text is not matching, TC is failed");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
