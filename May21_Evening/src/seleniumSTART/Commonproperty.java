package seleniumSTART;

import java.awt.AWTException;
import java.io.IOException;

public interface Commonproperty {
	//generalization
	// STANDARED PROGRAMMING    common properties put in interface or abstract class
	
    String key1 ="webdriver.chrome.driver";
    String value1="G:\\velocity class\\selenium server\\crome driver 92 selenium\\chromedriver.exe\\";
    
    String key2="webdriver.gecko.driver";
    String value2="G:\\velocity class\\firefox driver\\geckodriver.exe";
    
    String url1="https://www.facebook.com/";
    String url2="https://www.flipkart.com/";
    
    String Email= "8623800650";
    String Password= "Pass@123";
    
    public void chromelaunch() throws InterruptedException, IOException, AWTException ;
    public void firefoxaunch();
    
}
