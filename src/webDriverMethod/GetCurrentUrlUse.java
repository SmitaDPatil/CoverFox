package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlUse {

	public static void main(String[] args) throws InterruptedException
	
	{
		String expectedResult="https://vctcpune.com/";
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(100);
		
		String url =driver.getCurrentUrl();
		
		System.out.println("UrI is-->"+url);
		
		String actualResult=driver.getCurrentUrl();
		
          if(expectedResult.equals(actualResult))
			
		{
			System.out.println("Url is matching and TC is passed");
			
		}
		
		else {
			
			System.out.println("Url is not matching and TC is failed");
		}

		
		
		
		

		
	}

}
