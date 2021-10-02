package seleniumPRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXcelsheetHANDLE {
	
	public void excel() throws EncryptedDocumentException, IOException {
         String path ="G:\\velocity class\\ExcelsheetHANDLE.xlsx";
         for (int i=0;i<=3;i++) {
        	 for(int j=0;j<2;j++) {
         FileInputStream f= new FileInputStream(path);
         String val = WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
          System.out.print("  "+val);
        	 }
        	 System.out.println();
         }
}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		EXcelsheetHANDLE x= new EXcelsheetHANDLE();
		x.excel();
	}
}