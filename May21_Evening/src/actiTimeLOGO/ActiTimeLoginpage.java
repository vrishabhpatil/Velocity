package actiTimeLOGO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeLoginpage {
	// Declaration
	 private  WebElement un;
	 private    WebElement pwd;
	 private   WebElement login;
        WebDriver driver;
        
    //Initialization
       public ActiTimeLoginpage(WebDriver driver) {
    	  this.driver= driver;
    	  
    	  un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
    	  pwd=driver.findElement(By.xpath("//input[@name=\"pwd\"]"));
    	  login=driver.findElement(By.xpath("//div[text()=\"Login \"]"));
       }
       
    //usage
       public void setActiTimeusername() {
    	   un.sendKeys("admin");
       }
       public void setActiTimepassword() {
    	   pwd.sendKeys("manager");
       }
       public void ActiTimelogin() {
    	   login.click();
       }
}
