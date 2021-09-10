package actiTimrPageFactoryTEST;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actiTimePageFactory.ActiTimePageFactoryHOME;
import actiTimePageFactory.ActiTimePageFactoryLOGIN;
import seleniumSTART.Commonproperty;


public class ActitimePFverifyLOGOtest implements Commonproperty {
	static WebDriver driver;
	
	public void chromelaunch() throws InterruptedException, IOException, AWTException {
		System.setProperty(key1, value1);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}

	@Override
	public void firefoxaunch() {	}
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		ActitimePFverifyLOGOtest w=new ActitimePFverifyLOGOtest();
		w.chromelaunch();
		
		ActiTimePageFactoryLOGIN x=new ActiTimePageFactoryLOGIN(driver);
		x.setActiTimeusernamePF();
		x.setActiTimepasswordPF();
		x.ActiTimeloginPF();
		
		ActiTimePageFactoryHOME y=new ActiTimePageFactoryHOME(driver);
		y.ActiTimelogoPF();
		y.ActiTimelogout();
	}
	
}
