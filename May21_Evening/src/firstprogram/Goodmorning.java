package firstprogram;

public class Goodmorning {
	
	// 2. Non Static Method
	
	public void champa() {
		System.out.println("Chandrakant Patil Saheb");
	}

	public static void df() {
		System.out.println("Mi Punha Yein, Mi Punha yeil");
	}

	public static void main(String[] args) {
		System.out.println("BJP ");
		
		// How to call non-static method inside main method
		//Before calling non static method we need to creat object
		 Goodmorning s = new  Goodmorning();
		 s.champa();
		 df();
		
	}
	
}


