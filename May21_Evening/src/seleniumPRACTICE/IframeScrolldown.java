package seleniumPRACTICE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSTART.Commonproperty;

public class IframeScrolldown implements  Commonproperty{
	static WebDriver d;
	
	
	public void chromelaunch() throws InterruptedException, IOException {
		
		System.setProperty(key1, value1);
		d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(2000);
		JavascriptExecutor q =((JavascriptExecutor)d);
		q.executeScript("scroll(0,2100)");    //use tp scrollup means page down by2100mm
		d.switchTo().frame("a077aa5e");
		d.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]")).click();
		//ID
		//INDEX
		//WEBELEMENT
		//NAME
	}

	
	


	public void firefoxaunch() {}
	public static void main(String[] args) throws InterruptedException, IOException {
		IframeScrolldown z= new IframeScrolldown();
		z.chromelaunch();
	}
		
	

}
