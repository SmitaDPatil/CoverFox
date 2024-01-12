package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActions {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
       WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(100);
		
		//driver.findElement(By.name("login")).click();
		
		//1.find out the locator of webElement where we need to perform actions and store in some reference variable
		
		driver.findElement(By.name("login"));
		
		//2. Create an Object of an actions class which will accept driver object as a parameter
		
		Actions act = new Actions(driver);
		
		//3.Using one of the Actions class methods perform an action
		
		//act.moveToElement(loginButton).perform();
		
		//act.click().perform();
		
		//act.moveToElement(loginButton).click().build().perform();
		
		//act.click(loginButton).perform();
		
		
		

	}

}
