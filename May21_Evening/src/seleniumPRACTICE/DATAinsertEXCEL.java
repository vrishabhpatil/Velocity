package seleniumPRACTICE;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSTART.Commonproperty;

public class DATAinsertEXCEL implements Commonproperty {
	static WebDriver d;
// not complete program 

public void chromelaunch() throws InterruptedException, IOException, AWTException {
	System.setProperty(key1, value1);
	d= new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get("https://www.amazon.in/");
	String title = d.getTitle();
	System.out.println(title);
	
	String path="G:\\velocity class\\Excelsheetdata.xlsx";
	  FileInputStream f= new FileInputStream(path);
	  
	  XSSFWorkbook w= new XSSFWorkbook(f);
     XSSFSheet s = w.createSheet("vrishabh");
                  
     XSSFRow R = s.createRow(0);
    XSSFCell c1 = R.createCell(0);
    XSSFCell c2 = R.createCell(1);
    XSSFCell c3 = R.createCell(2);
    
    s.getRow(0).getCell(0).setCellValue(title);
}


public void firefoxaunch() {}
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	DATAinsertEXCEL z= new DATAinsertEXCEL();
	z.chromelaunch();
}
}
