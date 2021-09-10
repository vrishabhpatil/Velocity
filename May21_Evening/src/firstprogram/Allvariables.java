package firstprogram;

public class Allvariables {
	
	static int p = 100;
	static int q = 95;
	static String v = "Vrishabh Patil";
	
    int l = 90;
    String m = "Pranoti Patil";
			
	public static void boy() {  //STATIC METHOD
		System.out.println ("name of student is " +v);
		System.out.println("marks obtained in maths="+q);
   	    System.out.println("total marks="+ p);    
		
		}
		public void girl() {             //NON static method
			System.out.println("name of student is" +m);
			System.out.println("marks obtained in maths="+l);
	   	    System.out.println("total marks=" +p);    
			
			
			
		}
		public static void main(String[]args) {//MAIN METHOD
	
			System.out.println("Results");
			boy();
			Allvariables z = new Allvariables();
			z.girl();
}
}
