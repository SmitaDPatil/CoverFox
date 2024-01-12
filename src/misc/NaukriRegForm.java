package misc;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegForm {

	public static void main(String[] args) throws EncryptedDocumentException,IOException
	
	{
         WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=1196&wExp=N");
		
		driver.manage().window().maximize();
		CommanlyUsedMethod.implicitwait(driver, 5);
		
		WebElement fullName = driver.findElement(By.id("name"));
		WebElement emailID = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement mobile = driver.findElement(By.id("mobile"));
		
		//fullName.sendKeys("Shreeya Patil");
		//emailID.sendKeys("shreeya@email.com");
		//password.sendKeys("1234");
		//mobile.sendKeys("9099987281");
		
		fullName.sendKeys(CommanlyUsedMethod.readDataFromExcel(0, 0));
		emailID.sendKeys(CommanlyUsedMethod.readDataFromExcel(0, 1));
		password.sendKeys(CommanlyUsedMethod.readDataFromExcel(0, 3));
		mobile.sendKeys(CommanlyUsedMethod.readDataFromExcel(0, 4));
		

	}

}
