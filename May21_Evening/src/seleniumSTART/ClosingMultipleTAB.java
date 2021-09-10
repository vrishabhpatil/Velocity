package seleniumSTART;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingMultipleTAB implements Commonproperty{
	static WebDriver d;
	public void chromelaunch() {
		
//		in naukri website i want to close pop up tab one by one and then want search the location
//		as pune
		
		
		System.setProperty(key1, value1);
		    d=new ChromeDriver();
		    d.manage().window().maximize();
		    d.manage().deleteAllCookies();
		    d.navigate().to("https://www.naukri.com/");
		    
		  String parent = d.getWindowHandle();
		 Set<String> child = d.getWindowHandles();
		 for(String c :child) {                       //for each loop used to store the string
			 if(!parent.equalsIgnoreCase(c)) {        //first i want to close only child windows
				 d.switchTo().window(c);              // we want ,selenium focus on child window now
				 System.out.println("child title "+d.getTitle()); //only to know sequence of closing
				 d.close();
			 }
			
		 }
		 d.switchTo().window(parent);   
		 
//	    after for loop we want to focus on  parent window ,,,becoz
//		 want to find the element of parent window
//		 if switch to statement is not given it shows "no such window" exception
		 
		 d.findElement(By.xpath("//input[@name=\"location\"]")).sendKeys("pune");
			d.findElement(By.xpath("//button[text()='Search']")).click();  
}

	public void firefoxaunch() {}
	public static void main(String[] args) {
		ClosingMultipleTAB x=new ClosingMultipleTAB();
		x.chromelaunch();
	}
}