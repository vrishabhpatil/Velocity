package seleniumPRACTICE;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSTART.Commonproperty;

public class ImplicitWait implements Commonproperty {
	static WebDriver d;
	
	public void chromelaunch() throws InterruptedException, IOException {
		System.setProperty(key1, value1);
		    d= new ChromeDriver();
		    d.manage().window().maximize();
		    d.manage().deleteAllCookies();
		    d.get("https://paytm.com/recharge");
	//implicit wait --works for all webelement , first it load all webelement    
	//implicit wait----waiting time only
		    
		    
	        d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        WebElement w = d.findElement(By.xpath("//input[@id='radio1']"));
	        
	       boolean result = w.isSelected();
	       System.out.println(result);
	       if(result== true) {
	    	   System.out.println("test scenario pass "+result);
	       }else {
	    	   System.out.println("test scenario fail"+result);
	       }
	}
	
	public void firefoxaunch() {}
public static void main(String[] args) throws InterruptedException, IOException {
	ImplicitWait i=new ImplicitWait();
	i.chromelaunch();
}
}
