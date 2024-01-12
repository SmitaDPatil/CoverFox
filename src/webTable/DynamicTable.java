package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args)
	
	{
		 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			int numOfRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();

			int numOfColumns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
			
			System.out.println("====================================================================");
			
			//for reading header only
			
			for (int h=1;h<=numOfColumns;h++)
				
			{
				String data = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr[1]/th["+h+"]")).getText();
				
				System.out.print(data+" ");
			}
			System.out.println("==========================================================");
			
			//table body
			
			for (int i=1;i<=numOfRows;i++)//2-->27
				
			{
				for(int j=1;j<=numOfColumns;j++)
					
				{
					String data = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data+" ");
				}
				
				System.out.println();
				System.out.println("==========================================================");
				
				}
			}
	}


