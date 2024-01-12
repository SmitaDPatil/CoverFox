package practicewebEleMeStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsulatebyXpat {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		
		

	}

}
