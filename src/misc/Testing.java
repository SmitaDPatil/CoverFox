package misc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		CommanlyUsedMethod.implicitwait(driver, 2);
		CommanlyUsedMethod.takeScreenshot(driver, "Amazon Tests");
		
		 

	}

}
