package seleniumSTART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTesting implements Commonproperty{
    static WebDriver d;
    String ExpTitle ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
    
	@Override
	public void chromelaunch() {
		System.setProperty(key1, value1);
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to(url2);
		
			String ActTitle=d.getTitle();
			if(ExpTitle.equals(ActTitle)) {
				System.out.println("Test scenario is pass and title is =" +ActTitle);
			}
			else {
			System.out.println("Test scenario is fail" );
			}
	}

	@Override
	public void firefoxaunch() {
		
		
	}
	

}
