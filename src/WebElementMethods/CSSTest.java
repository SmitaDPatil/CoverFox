package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTest {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(1000);
	
	//CSSSelectors
	
	//Tag and ID -->CSS=tag#id
	
	driver.findElement(By.cssSelector("input#email")).sendKeys("Test@123");
	
	//Tag and Class-->CSS=tag.class
	
	//driver.findElement(By.cssSelector("div.6ltj")).click();
	
	//Thread.sleep(1000);
	
	//Tag and Attribute-->CSS=tag[attribute=value]
	
	//driver.findElement(By.cssSelector("button[name=login]"));
	
	Thread.sleep(1000);
	
	//Tag,class  and Attribute-->CSS=tag.class[attribute=value]
	
	driver.findElement(By.cssSelector("input.inputtext[id=\"pass\"]")).sendKeys("velocity");
		

	}

}
