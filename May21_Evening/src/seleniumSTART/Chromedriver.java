package seleniumSTART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "G:\\velocity class\\selenium server\\crome driver 92 selenium\\chromedriver.exe\\");
    WebDriver d=new ChromeDriver();
    d.manage().window().maximize();
    d.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAjwruSHBhAtEiwA_qCppi1-hH_KRrj6_6LGAesDGr_OhE2igwxYgVgI8msSAXoWDgkgzUifOBoCQ4QQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwruSHBhAtEiwA_qCppi1-hH_KRrj6_6LGAesDGr_OhE2igwxYgVgI8msSAXoWDgkgzUifOBoCQ4QQAvD_BwE");
    
}
}
