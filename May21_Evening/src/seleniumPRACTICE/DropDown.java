package seleniumPRACTICE;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import seleniumSTART.Commonproperty;

public class DropDown implements Commonproperty {
static WebDriver d;
	
	
	public void chromelaunch() throws InterruptedException, IOException {
		
		System.setProperty(key1, value1);
		d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://en-gb.facebook.com/");
		d.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(2000);
	// Here we need to use thread.sleep because we want to find the element
	// on the next page , so that it is neccessary to load the page fully
		
		// get()--wait till page load
		//navigate().to()---- does not wait to page load.
		
		WebElement day = d.findElement(By.xpath("//select[@title=\"Day\"]"));
		Select v= new Select(day);
		v.selectByVisibleText("1");
		
		
		WebElement month = d.findElement(By.xpath("//select[@title=\"Month\"]"));
		Select r= new Select(month);
			r.selectByIndex(6); //index starts from zero ,, starts counting from month
			
			
		WebElement year = d.findElement(By.xpath("//select[@title=\"Year\"]"));
		Select p= new Select(year);
		p.selectByValue("1998");   //in this we have to check the value of webelement
		                       //          in html code
		Thread.sleep(2000);
	
		// i want count of year present in year drop down
		List<WebElement> options = p.getOptions();
		int count = options.size();    //to get count of webelement
		 for(int i = 0; i<count ;i++) {
			 
			 String ele = options.get(i).getText();
			 System.out.println(ele);
			 
		 }
		 System.out.println(count);
}


	
	public void firefoxaunch() {}
		public static void main(String[] args) throws InterruptedException, IOException {
			DropDown z=new DropDown();
			z.chromelaunch();
		}
	}
