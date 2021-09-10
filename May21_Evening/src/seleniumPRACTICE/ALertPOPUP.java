package seleniumPRACTICE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSTART.Commonproperty;

public class ALertPOPUP  implements Commonproperty {
static WebDriver d;
	
	
	public void chromelaunch() throws InterruptedException, IOException {
		
		System.setProperty(key1, value1);
		d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://demoqa.com/alerts");
		
		d.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		}
	
      public void secondpopup() throws InterruptedException {
    		d.findElement(By.xpath("(//button[@type=\"button\"])[3]")).click();
    		Thread.sleep(5000);    //pop up will show after 5 sec
    		d.switchTo().alert().accept();
      }
      public void thirdpopup() throws InterruptedException {
  		d.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
  		d.switchTo().alert().dismiss();
    }
      public void fourthpopup() throws InterruptedException {
    		d.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
    		Thread.sleep(2000);
    		d.switchTo().alert().sendKeys("velocity");
    		d.switchTo().alert().accept();
      }



	
	public void firefoxaunch() {}
	public static void main(String[] args) throws InterruptedException, IOException {
		ALertPOPUP z= new ALertPOPUP();
		z.chromelaunch();
		z.secondpopup();
		z.thirdpopup();
		z.fourthpopup();
	}



	private void two() {
		// TODO Auto-generated method stub
		
	}
		
	}
