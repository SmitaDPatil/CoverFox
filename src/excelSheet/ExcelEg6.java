package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
FileInputStream myFile=new FileInputStream("C:\\Users\\admin\\Desktop\\folder1\\demo.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		 
		 Sheet mySheet = myWorkbook.getSheet("Sheet1");
		 
		 int lastRowNum = mySheet.getLastRowNum();
		 
		 int tatalNumOfRows = lastRowNum;
		 
		 short lastCellNum = mySheet.getRow(0).getLastCellNum();
		 
		 int totalNumOfCells = lastCellNum-1;
		 
		 // outer for loop-->
		 
		
		for(int i=0;i<=tatalNumOfRows ;i++)
			 
		 {
			
			//inner for loop-->cells
			
			for(int j=0;j<=totalNumOfCells;j++)
				
			{
			
			 String value = mySheet.getRow(i).getCell(j).getStringCellValue();
			 
			 System.out.print(value+" ");
		 }
			
			System.out.println();
		 

	}

	}
}
