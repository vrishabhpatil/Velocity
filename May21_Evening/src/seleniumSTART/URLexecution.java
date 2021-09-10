package seleniumSTART;

public class URLexecution extends URLtesting {
	
	
public static void main(String[] args) throws InterruptedException {
	
	URLtesting v=new URLtesting();
	v.chromelaunch() ;
	d.quit();
	
	Thread.sleep(3000);
	v.firefoxaunch();
	d.quit();
}
}
