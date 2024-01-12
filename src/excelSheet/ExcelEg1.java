package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		FileInputStream myFile = new FileInputStream("C:\\Users\\admin\\Desktop\\folder1\\demo.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);

	}

}
