package firstprogram;

public class Instatncevariable {
	//variable which is used  in class body
	//it is also called as non static body ,as it is access directly in non static method
	int p = 500;
	int q = 100;
	String v = "Vrishabh Patil";
			
	public static void division() {  //STATIC METHOD

	//	System.out.println(p/q);    {we cant use instance variable in static method} 
		
		}
		public void name() {             //NON static method
	
			System.out.println(p + q);
			System.out.println(v);
			
			
		}
		public static void main(String[]args) {//MAIN METHOD
	
			//System.out.println(p-q);    {becoz static method}
			division();
			Instatncevariable v = new Instatncevariable();
			v.name();
		}
}
