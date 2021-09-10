package seleniumPRACTICE;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSTART.Commonproperty;

public class MultipleWIndow implements Commonproperty {
	
//	task is click on 3rd link , search olympic ,close tab,click on 2019 and close browser
	
      static WebDriver d;
	public void chromelaunch() throws InterruptedException  {
		System.setProperty(key1, value1);
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		d.findElement(By.xpath("(//a[@target=\"_blank\"])[3]")).click();
		     String p = d.getWindowHandle();
		Set<String> pandc = d.getWindowHandles();
		for(String c: pandc) {
			if(!p.equalsIgnoreCase(c)) {
				
				d.switchTo().window(c);
				d.findElement(By.xpath("//input[@class='_yb_w60su']")).sendKeys("olympics");
				d.findElement(By.xpath("//input[@id=\"ybar-search\"]")).click();
				Thread.sleep(2000);
				d.close();
				Thread.sleep(2000);
			}
		}
		d.switchTo().window(p);
		d.findElement(By.xpath("(//a[@class=\"post-count-link\"])[3]")).click();
		d.quit();
	}


	public void firefoxaunch() {}
	public static void main(String[] args) throws InterruptedException {
		MultipleWIndow z=new MultipleWIndow();
		z.chromelaunch();
	}
        
}
