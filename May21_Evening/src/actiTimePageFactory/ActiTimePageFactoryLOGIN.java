package actiTimePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePageFactoryLOGIN {
	WebDriver driver;
	
	@FindBy(xpath="//input[@name=\"username\"]")
	 private  WebElement un;
	 
	@FindBy(xpath="//input[@name=\"pwd\"]")
	 private    WebElement pwd;
	 
	@FindBy(xpath="//div[text()=\"Login \"]")
	 private   WebElement login;
	
	public ActiTimePageFactoryLOGIN (WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	public void setActiTimeusernamePF() {
 	   un.sendKeys("admin");
    }
    public void setActiTimepasswordPF() {
 	   pwd.sendKeys("manager");
    }
    public void ActiTimeloginPF() {
 	   login.click();
    }
        
}
