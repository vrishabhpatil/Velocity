package actiTimeLOGO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeHomepage {
	//Declaration
	private  WebElement  logo;
	private  WebElement logout;
         WebDriver driver;
    //Initialization
         public ActiTimeHomepage(WebDriver driver) {
        	 this.driver= driver;
        	 logo=driver.findElement(By.xpath("//img[@height=\"61\"]"));
        	 logout=driver.findElement(By.xpath("//a[@id=\"logoutLink\"]"));
        	 }
         
      //Usage
         public void ActiTimelogo() {
      	  boolean val = logo.isDisplayed();
      	  if(val==true) {
      		  System.out.println("test scenario is passed " +val);
      	  }else
      	  {System.out.println("test scenario is failed " +val);}
         }
         public void ActiTimelogout() {
        	 logout.click();
         }
}
