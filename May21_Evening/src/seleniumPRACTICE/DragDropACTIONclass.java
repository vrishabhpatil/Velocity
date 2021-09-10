package seleniumPRACTICE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seleniumSTART.Commonproperty;

public class DragDropACTIONclass implements Commonproperty{
static WebDriver d;
	
	
	public void chromelaunch() throws InterruptedException, IOException {
		
		System.setProperty(key1, value1);
		d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		d.switchTo().frame(0);
		WebElement element1 = d.findElement(By.id("draggable"));
		WebElement element2 = d.findElement(By.id("droppable"));
		
		Actions a= new Actions(d);
	//	a.clickAndHold(element1).moveToElement(element2).release().build().perform();
// i am performing 3actions/multiple action  at a time , that why we need to build and perform 
		
		
		a.dragAndDrop(element1, element2).perform();
		d.switchTo().defaultContent();
		
		d.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("h");
		Thread.sleep(2000);
		
		WebElement element3 = d.findElement(By.xpath("(//a[@title=\"jQuery UI\"])[2]"));
		a.contextClick(element3).perform();  //right click
		Thread.sleep(2000);
		
		
		a.doubleClick(element3).perform();     //double click
}



	public void firefoxaunch() {}
		public static void main(String[] args) throws InterruptedException, IOException {
			DragDropACTIONclass z= new DragDropACTIONclass();
			z.chromelaunch();
		}
	}
