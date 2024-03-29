package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableDropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
				
			driver.get("https://demoqa.com/select-menu");
			
			Thread.sleep(1000);
			
		WebElement dropDown = driver.findElement(By.id("cars"));
			
			Select s=new Select(dropDown);
			
			System.out.println(s.isMultiple());
			
			s.selectByVisibleText("Volvo");
			
			Thread.sleep(500);
			
			s.selectByIndex(3);
			
			Thread.sleep(500);
			
			s.selectByValue("opel");
			
			Thread.sleep(500);
			
			//s.deselectByIndex(2);
			
			Thread.sleep(500);
			
			//s.deselectByValue("opel");
			
			Thread.sleep(500);
			
			//s.deselectByVisibleText("Volvo");
			
			Thread.sleep(500);
			
			s.deselectAll();
			

	}

}
