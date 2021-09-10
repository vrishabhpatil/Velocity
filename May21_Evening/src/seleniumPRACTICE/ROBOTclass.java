package seleniumPRACTICE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSTART.Commonproperty;

public class ROBOTclass implements Commonproperty{
   // window popup made by the browser , we cant manupulate that , for that we use 
	// robot class
	//it helps to press the key virtually
	
	
	static WebDriver d;
	public void chromelaunch() throws AWTException, InterruptedException {
		 System.setProperty(key1, value1);
		 d=new ChromeDriver();
	
		d.manage().window().maximize();
		d.get("https://en-gb.facebook.com/");
		d.manage().deleteAllCookies();
		WebElement mo = d.findElement(By.name("email"));
		mo.sendKeys(Email);
		d.findElement(By.name("pass")).sendKeys(Password);
		d.findElement(By.name("login")).click();
		
		WebElement m = d.findElement(By.name("email"));
		m.sendKeys(Email);
		d.findElement(By.name("pass")).sendKeys(Password);
		d.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
	     Thread.sleep(15000);
		
  
		 Robot q=new Robot();
         // to close the browser popup we need to click 3 time tap
        q.keyPress(KeyEvent.VK_TAB);
        q.keyRelease(KeyEvent.VK_TAB);
        
        q.keyPress(KeyEvent.VK_TAB);
        q.keyRelease(KeyEvent.VK_TAB);
        
         q.keyPress(KeyEvent.VK_TAB);
        q.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        q.keyPress(KeyEvent.VK_ENTER);
		
	}

	public void firefoxaunch() {}
	public static void main(String[] args) throws AWTException, InterruptedException {
		ROBOTclass r=new ROBOTclass();
		r.chromelaunch();
	}
}
