package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\admin\\Desktop\\folder1\\demo.xlsx");
		
		 Workbook myWorkbook = WorkbookFactory.create(myFile);
		 
		 Sheet mySheet = myWorkbook.getSheet("Sheet1");
		 
		Row myRow = mySheet.getRow(2);
		
		Cell myCell = myRow.getCell(0);
		
		CellType myDataType = myCell.getCellType();
		
		System.out.println(myDataType);
				
		 
	
	}	

}
