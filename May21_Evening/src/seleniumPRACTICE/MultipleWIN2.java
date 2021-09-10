package seleniumPRACTICE;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSTART.Commonproperty;

public class MultipleWIN2 implements Commonproperty{
	
//	 task is click on 4th link . login fb page
	
	static WebDriver d;
	public void chromelaunch() throws InterruptedException  {
		System.setProperty(key1, value1);
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		d.findElement(By.xpath("//a[text()=\" Click this link to start  Session in same window\"]")).click();
		    String p = d.getWindowHandle();
		Set<String> pandc = d.getWindowHandles();
		
		    	d.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(Email);
				d.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(Password);
				d.findElement(By.xpath("//button[1]")).click();
			//	d.findElement(By.xpath("(//div[@role=\"button\"])[3]")).click();
            // d.findElement(By.xpath("(//span[@dir=\"auto\"])[9]")).click();
				Thread.sleep(10000);
				d.close();
			
		
}

	public void firefoxaunch() {}
	public static void main(String[] args) throws InterruptedException {
		MultipleWIN2 z=new MultipleWIN2();
		z.chromelaunch();
	}
		
	}
