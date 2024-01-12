package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;



public class CommanlyUsedMethod 

{

	//reading data from excel
	//taking screenshot
	//scrolling
	//waiting
	
	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\admin\\Desktop\\SreenShot\\"+fileName+".png");
		FileHandler.copy(src, dest);
	}

	public static void scrollIntoView(WebDriver driver,WebElement element)
	
	{
		JavascriptExecutor js=(	JavascriptExecutor)driver;
		implicitwait(driver,10);
		js.executeScript("arguments[0]. scrollIntoVeiw();",element);
	}
	
	public static void implicitwait(WebDriver driver,int time)
	
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream myFile=new FileInputStream ("C:\\Users\\admin\\Desktop\\folder1\\demo.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		 String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	
	}
		
	
public static String readDataFromExcel( String SheetName,int row, int cell) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream myFile=new FileInputStream ("C:\\Users\\admin\\Desktop\\folder1\\demo.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("SheetName");
		 String Value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		 
		return Value;
		
	}
		
		public static String readDataFromPropertyFile(String key) throws IOException
		{
		//Create object of Properties class
		Properties prop= new Properties();
		//File Location
		FileInputStream myFile= new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse new\\automationSelenium1\\coverFoxData.properties");
		
	
		//load file
		prop.load(myFile);
		//pass the Key for the data we want
		String value = prop.getProperty(key);
		return value;
			 
		}
}

