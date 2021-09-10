package seleniumSTART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriver {
	public static void main(String[] args) {
	    System.setProperty("webdriver.gecko.driver", "G:\\velocity class\\firefox driver\\geckodriver.exe");
	    WebDriver v=new FirefoxDriver();
	    v.manage().window().maximize();
	    v.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAjwruSHBhAtEiwA_qCppi1-hH_KRrj6_6LGAesDGr_OhE2igwxYgVgI8msSAXoWDgkgzUifOBoCQ4QQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwruSHBhAtEiwA_qCppi1-hH_KRrj6_6LGAesDGr_OhE2igwxYgVgI8msSAXoWDgkgzUifOBoCQ4QQAvD_BwE");

	    //    v.close();   if multiple tab are open and wanted close single tab then we used "close"
	    v.quit();   // if we want to close the browser then "quite" is used
	}
}
