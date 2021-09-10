package firstprogram;

public class Constructor {
        //constructor name is same as class name
	    //return type should not declared in constructor
	    //we can declare any no. of constructor in java but name is same as 
//   class name and having different arguments
	
	  //Argument = parameter= datatype variablename
	
	//constructor is used to initialize the data memeber/variable of class
	
	 String a; //declaration
	int age;
	public Constructor() {  //initialization
	
		a="vrishabh patil";
		age=23;
		System.out.println(a + "\n"+age);
	}
	public Constructor(int v) {
		a= "Hritik roshan";
		age=v; //or
		//age=50;
		System.out.println(a+ "\n"+ age);
		
	}
	public Constructor(int r ,String s ) {
		a= s;
		age=r; //or
		//age=50;
		System.out.println(a+ "\n"+ age);
	}
	
	public static void main(String[]agrs) { //usage
		new Constructor(); //calling constructor
		new Constructor(50);//while calling constructor you should 
		//enter the value of argument to recognize the correct constructor

		new Constructor(75,"Lata mangeshkar");
	}
	
	
	
}
