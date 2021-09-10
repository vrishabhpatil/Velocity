package oOPS;

public class Polymorphism {
	public void compiletime() {
		System.out.println("hello");
	}
	public void compiletime(int a) {            // method overloading
		System.out.println("Good morning");
	}
	public static void main (String[]args) {
		Polymorphism v=new Polymorphism ();
		v.compiletime();
		v.compiletime(0);
		//compile time polymorphism
		// method defination is going to get binded while comiling it 
		//is based on argument
	}

}
