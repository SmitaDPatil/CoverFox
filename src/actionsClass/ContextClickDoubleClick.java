package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		Thread.sleep(1000);
		
		//example for right click(context click)
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		
		//act.contextClick(rightClickButton).perform();
		
		//===============================================================================================================
		
		//example for Double click
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double-Click ')]"));
		
		Actions act1=new Actions(driver);
		
		//act1.moveToElement(doubleClickButton).perform();
		
		act1.moveToElement(doubleClickButton).doubleClick().build().perform();

	}

}
