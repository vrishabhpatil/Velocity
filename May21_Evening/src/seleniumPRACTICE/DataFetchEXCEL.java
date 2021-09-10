package seleniumPRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFetchEXCEL {
   public void data() throws EncryptedDocumentException, IOException {
	  String path="G:\\velocity class\\Excelsheetdata.xlsx";
	

	  for(int i=0;i<4;i++) {
		  for(int j=0;j<3;j++) {
			  
			  FileInputStream f= new FileInputStream(path);
			  
		 String val = WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();	
		 System.out.print(" "+ val );
		 
		  }
	
		 System.out.println(" ");
	  }
	
   }
   public void vertical() throws EncryptedDocumentException, IOException {
	   String p="G:\\velocity class\\Excelsheetdata.xlsx";
		
	   for(int j=0;j<3;j++) {
			   for(int i=0;i<4;i++)  {
				  
				  FileInputStream f= new FileInputStream(p);
				  
			 String val = WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();	
			 System.out.print(" "+ val );
			 
   }
			   System.out.println(" ");
  }
	   }
   public static void main(String[] args) throws EncryptedDocumentException, IOException {
	   DataFetchEXCEL z= new DataFetchEXCEL();
	   z.data();
	   z.vertical();
}
}
