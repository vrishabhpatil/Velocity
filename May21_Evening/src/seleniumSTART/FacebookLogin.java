package seleniumSTART;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin implements Commonproperty{

	static WebDriver d;
	public void chromelaunch() {
		 System.setProperty(key1, value1);
		 d=new ChromeDriver();
	
		d.manage().window().maximize();
		d.navigate().to(url1);
		WebElement mo = d.findElement(By.name("email"));
		mo.sendKeys(Email);
		d.findElement(By.name("pass")).sendKeys(Password);
		d.findElement(By.name("login")).click();
	}

	public void firefoxaunch() {}
	


}
