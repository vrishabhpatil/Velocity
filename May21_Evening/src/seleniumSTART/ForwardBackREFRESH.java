package seleniumSTART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardBackREFRESH implements Commonproperty {
      static WebDriver d;
	@Override
	public void chromelaunch() throws InterruptedException   {
		System.setProperty(key1, value1);
		d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.navigate().to(url1);   // very important
		Thread.sleep(2000);    // we need to throw exeption in main method and commonproperty class also
		                       // becoz of thread.sleep 
		d.navigate().to(url2);
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();
		Thread.sleep(2000);
		
	}

	@Override
	public void firefoxaunch() {
		
		
	}
	
}
