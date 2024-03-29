package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drodown2 {

	public static void main(String[] args) throws InterruptedException
	
{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement dropDown = driver.findElement(By.id("cars"));
		
		Select s=new Select(dropDown);
		
		System.out.println(s.isMultiple());
		
		s.selectByVisibleText("Volvo");
		
		Thread.sleep(500);
		
		s.selectByIndex(2);
		
		Thread.sleep(500);
		
		s.selectByValue("audi");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		System.out.println("========================================================");
		
		List<WebElement> options = s.getOptions();
		
		//System.out.println(options);
		
		for(WebElement o:options)
			
		{
			System.out.println(o.getText());
		}
		
		System.out.println("========================================================");
		
		List<WebElement> selectedoptions = s.getAllSelectedOptions();
		
		for(WebElement so:selectedoptions)
			
		{
			System.out.println(so.getText());
			
		}
		
		

	}

}
