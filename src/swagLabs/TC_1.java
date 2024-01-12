package swagLabs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement user_name = driver.findElement(By.name("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login_button = driver.findElement(By.name("login-button"));
		
		user_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login_button.click();
		
		WebElement backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		//WebElement bike_light = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		
		backpack.click();
		//bike_light.click();
		
		WebElement carButton = driver.findElement(By.id("shopping_cart_container"));
		
		carButton.click();
		
		
		List<WebElement> cartItems = driver.findElements(By.className("inventory_item_name"));
		
		System.out.println("Number of items are "+cartItems.size());
		
		for(WebElement ci:cartItems)
			
		{
			System.out.println("items are "+ci.getText());
			
			//validate item is same as what we want
			
			Iterator<WebElement> it = cartItems.iterator();
			WebElement itemNum1 = it.next();
			
			if(itemNum1.getText().equals("sauce Labs Backpack"))
				
			{
				System.out.println("selected items is correct as==>sauce Labs Backpack");
				driver.findElement(By.name("checkout")).click();
			}
			
			
			else {
		
		
		
			System.out.println("selected items is not correct");
		}
		
		//put your name last name and zip code
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		WebElement continueButton = driver.findElement(By.name("continue"));
		
		firstName.sendKeys("Velocity");
		lastName.sendKeys("Pune");
		postalCode.sendKeys("416066");
		continueButton.click();
		
		WebElement finishButton = driver.findElement(By.id("finish"));
		
		WebElement thankYouMsg = driver.findElement(By.xpath("//h2[text()=Thank you for your order!]"));
		
		if( thankYouMsg.getText().equals("Thank you for your order!"))
			
		{
			System.out.println("Thank you msg is displayed.....logging out");
			
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(500);
			driver.findElement(By.id("logout_sidebar_link")).click();
			
		}
		else {
			System.out.println("Thank you msg is not displayed........please check");
			
			
		}
		}
		
	
	}
}

	
	

