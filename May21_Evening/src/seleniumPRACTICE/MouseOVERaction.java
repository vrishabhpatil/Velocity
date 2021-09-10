package seleniumPRACTICE;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seleniumSTART.Commonproperty;

public class MouseOVERaction implements Commonproperty{
      static WebDriver d;
	static String q;
	public void chromelaunch() throws InterruptedException, IOException {
		System.setProperty(key1, value1);
		    d= new ChromeDriver();
		    d.manage().window().maximize();
		    d.manage().deleteAllCookies();
		    d.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		    
		    WebElement ele = d.findElement(By.xpath("//button[@class=\"dropbtn\"]"));
		    
		    Actions a= new Actions(d);
		    a.moveToElement(ele).perform();
		    
		  List<WebElement> elements = d.findElements(By.xpath("//div[@class=\"dropdown-content\"]//a"));
		  int size = elements.size();
		  System.out.println(size);
		
		for(int i=0;i<=size;i++) {
			WebElement f = elements.get(i);        // we get the link present in webelements i , stored in f
			String p = f.getAttribute("innerHTML");     //we want attribute from html code , so getting from inner html code here
			System.out.println(p);
			
		
		
			if(p.equalsIgnoreCase("testng")) {
				f.click();      
//stale element reference: element is not attached to the page document....imp
				
//exception throws because selenium did not find third element 	
//to overcome this we need to break the loop
				break;
				
			}
			
		}
	
	}
	
	
	public void firefoxaunch() {}
public static void main(String[] args) throws InterruptedException, IOException {
	MouseOVERaction m= new MouseOVERaction();
	
	m.chromelaunch();
}
}
