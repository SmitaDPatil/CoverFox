package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\admin\\Desktop\\folder1\\demo.xlsx");
		
		 Workbook myWorkbook = WorkbookFactory.create(myFile);
		 
		 Sheet mySheet = myWorkbook.getSheet("Sheet1");
		 
		 //read whole excelsheet
		 
		 //outer for loop-->row-->0-->1
		 
		 for (int i=0;i<=1;i++)
		 {
			 //inner for loop-->cells-->0-->2
			 for(int j=0;j<=2;j++)
				 
			 {
				 String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				 
				 System.out.print(value+" ");
				 
			 }
			 System.out.println();
		 }
		 

	}

}
