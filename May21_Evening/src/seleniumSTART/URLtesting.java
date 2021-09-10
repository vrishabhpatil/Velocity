package seleniumSTART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URLtesting implements Commonproperty {
     static WebDriver d;
     String ExpURL="https://www.facebook.com/";
	@Override
	public void chromelaunch() {
		System.setProperty(key1, value1);
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to(url1);
		String ActURL =d.getCurrentUrl();
		if(ExpURL.equals(ActURL)) {
			System.out.println("The test scenario is passed in chrome and URL is"+ActURL);
		}
		else {
			System.out.println("The test scenario is fail ");
		}
	}
	

	@Override
	public void firefoxaunch() {
		System.setProperty(key2, value2);
		d= new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to(url1);
		
		String ActURL =d.getCurrentUrl();
		
		if(ExpURL.equals(ActURL)) {
			System.out.println("The test scenario is passed in firefox and URL is"+ActURL);
		}
		else {
			System.out.println("The test scenario is fail ");
		}
	}
	
	}


