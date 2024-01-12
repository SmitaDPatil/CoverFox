package actionsClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException
	{
		//create object of Properties
		Properties prop= new Properties();
		//Create Object of FileInputStream
		//FileInputStream myFile= new FileInputStream("C:\\Users\\admin\\Desktop\\eclipse new\\automationSelenium1\\coverFoxData.properties");
		
		//or//
		
		FileInputStream myFile= new FileInputStream(System.getProperty("user.dir")+"\\coverFoxData.properties");
				
		prop.load(myFile);
		String value = prop.getProperty("CityName");
		System.out.println(value);

	}

}
