package seleniumSTART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTO implements Commonproperty {
       static  WebDriver d;        /* WebDriver is non primitive datatype  like string ///starts from 
                                   capital letter */
	@Override
	public void chromelaunch() {
		System.setProperty(key1, value1);
		d=new ChromeDriver();
		d.navigate().to(url1);;          //instead of get methodwe use navigate to method
	}

	@Override
	public void firefoxaunch() {
		System.setProperty(key2, value2);
		d=new FirefoxDriver();
		d.navigate().to(url2);; 
		
	}

}
