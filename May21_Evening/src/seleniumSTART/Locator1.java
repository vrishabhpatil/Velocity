package seleniumSTART;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 implements Commonproperty {

    static WebDriver d;
	public void chromelaunch()  {
		System.setProperty(key1, value1);
		d =new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("file:///C:/Users/WE/Desktop/may%202021.html");
		
		 WebElement un = d.findElement(By.tagName("input")); //1st way
		 un.sendKeys("vrishabhpatil");
		 d.findElement(By.id("EM345")).sendKeys("vrishabhpatil@gmail.com");
		 d.findElement(By.name("male")).click();
	}

	
	public void firefoxaunch() {
		
		
	}
public static void main(String[] args) {
	Locator1 x=new Locator1();
	x.chromelaunch();
}
}
