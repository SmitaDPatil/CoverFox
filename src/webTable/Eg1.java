package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args)
	
	{
		
		//Identify web Table
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement bookTable = driver.findElement(By.name("BookTable"));
		
		//how many rows in table
	List<WebElement> rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	
	int numberOfRows = rows.size();
	
	System.out.println("Nuber of rows in table are"+numberOfRows);
	
	
	//how many columns in table
	
	List<WebElement> headers= driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
	
	int numberOfColumns = headers.size();	
	
	System.out.println("Number of column in table are"+numberOfColumns);
				

	}

}
