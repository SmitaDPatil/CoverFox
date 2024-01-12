package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException
	
	{
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://skpatro.github.io/demo/links/");
			
			Thread.sleep(1000);
			
			//getting text on main page
			
	         WebElement mainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
	         
	         System.out.println("Main page text is"+mainPageElement.getText());
	         
	         //clicking on newWindowButton
	         
	         driver.findElement(By.name("NewWindow")).click();
	         
	         Thread.sleep(1000);
	         
	        // driver.close();//close current browser tab
	         
	        // driver.quit();//close all opened browser tab
	         
	         //to switch to child window we should know ID of child window
	         
	       String mainPageID = driver.getWindowHandle();
	         
	       System.out.println("ID of main page is"+mainPageID);
	       
	       //use getWindowHandles() method to get all page ids
	       
	       Set<String> allWindowID = driver.getWindowHandles();
	         
	       Iterator<String> it = allWindowID.iterator();
	       
	       String mainPageId = it.next();//getting IDof main page
	      
	       String child1ID = it.next();
	       
	       System.out.println("Main page id is"+mainPageId);

	       System.out.println("Child page id is"+child1ID);
	       
	     // switching focusfrom main page to child window
	       
	       driver.switchTo().window(child1ID);
	       
	       Thread.sleep(2000);
	       
	       driver.manage().window().maximize();//will maximize child window
	       
	       driver.findElement(By.id("the7-search")).sendKeys("Good Evening");
	       
	       Thread.sleep(2000);
	       
	       //driver.close();//NoSuchWindowException
	       
	       System.out.println(driver.findElement(By.xpath("//h1[text()='About me']")).getText());
	       
	       //again to work on main page--> we need to switch focus from child window to main page
	       
	       driver.switchTo().window(mainPageId);
	       
	       Thread.sleep(2000);
	       
	       String mainPageText2 = driver.findElement(By.xpath("//p[contains(text(),' new browser window')]")).getText();
	       
	       System.out.println("Main page text is"+mainPageText2);
	    		   
	       
	       
	     

	 
	     
	       
	     

	}

}
