package firstprogram;

public class Localvariables {
//variable which is inside the method is called as local variables
	//scope of local variable is within the method body
	
	public static void division() {  //STATIC METHOD
	int a = 100;
	int b =10;
	System.out.println(a/b);
	}
	public void name() {             //NON static method
		String a = "Vrishabh";
		String b = "Patil";
		System.out.println(a + b);
		
	}
	public static void main(String[]args) {//MAIN METHOD
		int a =10;
		int b = 10;
		System.out.println(a-b);
		division();
		Localvariables v = new Localvariables();
		v.name();
	}
	
	
	}
