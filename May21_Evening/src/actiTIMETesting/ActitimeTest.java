package actiTIMETesting;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actiTimeLOGO.ActiTimeHomepage;
import actiTimeLOGO.ActiTimeLoginpage;
import seleniumSTART.Commonproperty;

public class ActitimeTest implements Commonproperty {
	static WebDriver driver;
	
	public void chromelaunch() throws InterruptedException, IOException, AWTException {
		System.setProperty(key1, value1);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
	}

	public void firefoxaunch() {}
		
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ActitimeTest t=new ActitimeTest();
			t.chromelaunch();
			ActiTimeLoginpage l=new ActiTimeLoginpage(driver);
			l.setActiTimeusername();
			l.setActiTimepassword();
			l.ActiTimelogin();
			
			ActiTimeHomepage h=new ActiTimeHomepage(driver);
			h.ActiTimelogo();
			h.ActiTimelogout();
			
		}
	
	
}
