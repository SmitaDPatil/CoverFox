package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
			
	{
       WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act=new	Actions(driver);
		
		//act.moveToElement(source).clickAndHold(target).moveToElement(target).release().build().perform();
		
		act.clickAndHold(source).release(target).perform();
		
		//act.dragAndDrop(source, target).perform();
		

	}

}
