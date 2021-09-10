package seleniumPRACTICE;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import seleniumSTART.Commonproperty;

public class TakeScreenshot implements Commonproperty{
         static WebDriver d;
	public void chromelaunch() throws InterruptedException, IOException {
	System.setProperty(key1, value1);
	d =new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to(url1);
	
	File source=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE); //taking screenshot
		String path = "G:\\velocity class\\seleniumsnap.png";  
		//we have to give the path to save the screenshot
		
		
		File destination =new File(path); //we cant handle directly windows file that why selenium told to use the class
		//by using object....
		//to store the screenshot from source to file we use class
		FileHandler.copy(source, destination);   //  (file from ,file to)
		//here we need to throw exception becoz if there is mismatch while opening 
		//windows file / file not open 
		d.close();
	}

	
	public void firefoxaunch() {}
		public static void main(String[] args) throws InterruptedException, IOException {
			TakeScreenshot z= new TakeScreenshot();
			z.chromelaunch();
		}

}
