package firstprogram;

public class Staticvariable {
	//static variable can access all method
	//static variable declare inside class body with static keyword

	static int p = 500;
	static int q = 100;
	static String v = "Vrishabh Patil";
			
	public static void division() {  //STATIC METHOD

   	System.out.println(p/q);    
		
		}
		public void name() {             //NON static method
	
			System.out.println(p + q);
			System.out.println(v);
			
			
		}
		public static void main(String[]args) {//MAIN METHOD
	
		    System.out.println(p-q);   
			division();
			Instatncevariable v = new Instatncevariable();
			v.name();
}
}
