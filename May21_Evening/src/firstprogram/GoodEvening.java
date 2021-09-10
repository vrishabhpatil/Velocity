package firstprogram;

public class GoodEvening {

	// b. Business/ Regular Methods
	//	{} = block / body

	// 1. Static Method
	public static void addition() {
		System.out.println(77 +98);
	}
	public static void main(String[] args) {
		System.out.println("Main Method is running");
		// How i will call Static Method inside main method
		// methodnamewithmethodsignature
		demo2();
		addition();
		
	}
	public static void demo2() {
		System.out.println("James Saheb");
	}
	
	//Execution Purpose


}


