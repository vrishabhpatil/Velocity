package seleniumSTART;

public class ExecutionCLASS extends NavigateTO{
	public static void main(String[] args) throws InterruptedException {
		
		NavigateTO v=new NavigateTO();
		v.chromelaunch();
		d.close();
		
		Thread.sleep(3000);  //3000  Millisecond =3sec     we forcefully stop it ,,if any error inbetween 
		//3 sec thats why we throws interrupted error outside the method
		
		v.firefoxaunch();
		d.close();
	}
} 
