package seleniumSTART;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPATH implements Commonproperty{

	static WebDriver d;
	public void chromelaunch() {
		System.setProperty(key1, value1);
		    d=new ChromeDriver();
		    d.manage().window().maximize();
		    d.navigate().to("file:///C:/Users/WE/Desktop/may%202021.html");
		    
		 WebElement x=d.findElement(By.xpath("html/body/div1/input"));
		 x.sendKeys("nnnnn");
		
	}

	
	public void firefoxaunch() {}
public static void main(String[] args) {
	AbsoluteXPATH v=new AbsoluteXPATH();
	v.chromelaunch();
	
}
}