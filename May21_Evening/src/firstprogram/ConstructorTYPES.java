package firstprogram;

public class ConstructorTYPES {
	//declaration
	 String a; 
		int age;
		//initialization
		public ConstructorTYPES() {  //ZERO Arguments /non-arguments
		
			a="vrishabh patil";
			age=23;
			System.out.println(a + "\n"+age);
		}
		public ConstructorTYPES(int v) { //parameterized constructor/
			//Argument constructor
			
			a= "Hritik roshan";
			age=v; //or
			//age=50;
			System.out.println(a+ "\n"+ age);
			
		}
		public ConstructorTYPES(int r ,String s ) {
			a= s;
			age=r; //or
			//age=50;
			System.out.println(a+ "\n"+ age);
		}
		
		public static void main(String[]agrs) { //usage
			new ConstructorTYPES(); //calling constructor
			new ConstructorTYPES(50);//while calling constructor you should 
			//enter the value of argument to recognize the correct constructor

			new ConstructorTYPES(75,"Lata mangeshkar");
		}
		
		
		

}
