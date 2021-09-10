package actiTimePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePageFactoryHOME {
	@FindBy(xpath="//img[@height=\"61\"]")
	private  WebElement  logo;
	@FindBy(xpath="//a[@id=\"logoutLink\"]")
	private  WebElement logout;
         WebDriver driver;
         
         public ActiTimePageFactoryHOME(WebDriver driver) {
        	 PageFactory.initElements(driver,this);
         }
         
         //usage
         
         public void ActiTimelogoPF() {
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
