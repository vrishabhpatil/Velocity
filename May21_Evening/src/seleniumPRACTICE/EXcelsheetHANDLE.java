package seleniumPRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXcelsheetHANDLE {
	
	public void excel() throws EncryptedDocumentException, IOException {
         String path ="G:\\velocity class\\ExcelsheetHANDLE.xlsx";
         FileInputStream f= new FileInputStream(path);
         String val = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
         System.out.println(val);
         
}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		EXcelsheetHANDLE x= new EXcelsheetHANDLE();
		x.excel();
	}
}