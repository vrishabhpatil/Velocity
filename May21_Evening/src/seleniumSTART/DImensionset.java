package seleniumSTART;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DImensionset implements Commonproperty{
	static WebDriver d;
	public void chromelaunch() {
		System.setProperty(key1, value1);
		    d=new ChromeDriver();
		    d.manage().window().maximize();
		    d.manage().deleteAllCookies();
		    d.navigate().to("file:///C:/Users/WE/Desktop/may%202021.html");
		    
		Dimension v = new Dimension(300, 600);
	      d.manage().window().setSize(v);
	        
	      Point p =new Point(600, 300);    //move x=600 and y=300
	      d.manage().window().setPosition(p);
}
	
	public void firefoxaunch() {}
	
	public static void main(String[] args) {
		DImensionset x= new DImensionset();
		x.chromelaunch();
	}
	
	}
