package seleniumSTART;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles implements Commonproperty{
	static WebDriver d;
	public void chromelaunch() {
		System.setProperty(key1, value1);
		    d=new ChromeDriver();
		    d.manage().window().maximize();
		    d.manage().deleteAllCookies();
		    d.navigate().to("https://www.naukri.com/");
		    
		    String parentid = d.getWindowHandle();  //to get parent window id
		    System.out.println("parent window id"+parentid);
		    
		   Set<String> pandc = d.getWindowHandles(); //we get both parent and child window id
		   System.out.println("parent and child window id"+pandc);
		  int count = pandc.size();
		  System.out.println("total tabs="+count);
}
	
	public void firefoxaunch() {}
	public static void main(String[] args) {
		WindowHandles x=new WindowHandles();
		x.chromelaunch();
	}
}