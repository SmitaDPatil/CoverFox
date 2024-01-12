package popUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipalWindowHandling {

	public static void main(String[] args) throws InterruptedException
	
	{
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.naukri.com/");
			
			Thread.sleep(100);
			
			driver.findElement(By.xpath("//span[text()='Remote']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='MNC']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Banking & Finance']")).click();
			Thread.sleep(1000);
			
			Set<String> allTabsID = driver.getWindowHandles();
			
			ArrayList<String>al=new ArrayList<>(allTabsID);
			
			for(int i=0;i<al.size();i++)//0,1)
				
			{
				Thread.sleep(1000);
				driver.switchTo().window(al.get(i));
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
				Thread.sleep(1000);
				driver.close();
				
				
			}

	}

}
