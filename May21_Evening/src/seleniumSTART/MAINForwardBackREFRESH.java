package seleniumSTART;

public class MAINForwardBackREFRESH extends ForwardBackREFRESH {
	public static void main(String[] args) throws InterruptedException  {
		ForwardBackREFRESH x=new ForwardBackREFRESH();
		x.chromelaunch();
		Thread.sleep(2000);
		d.quit();
	}

}
