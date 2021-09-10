package firstprogram;

public class Datatypes {
	//Primitive datatypes in Java
	
	public void dt() {     //non static method
		
		boolean t=true;    //default value is false
		System.out.println("True Value of  Boolean is : " +t);
		boolean f=false;
		System.out.println("False value of boolean is : " +f +"\n");
		
		short g=-32768; //range is given
		short h=32767;
		System.out.println("Minimum value of short : " +g);
		System.out.println("Maximum value of short : " +h +"\n");
		
		byte a=-128;
		byte b=127;
		System.out.println("Minimum value of byte : " +a);
		System.out.println("Maximum value of byte : " +b +"\n");
		
		int i=-2147483648;
		int o=2147483647;
		System.out.println("Minimum value of int : " +i);
		System.out.println("Maximum value of int : " +o +"\n");
		
		long m=-2147483648234345l;
		long n=2147483647565647L;
		System.out.println("Minimum Value of long with letter l : " +m);
		System.out.println("Maximum value of long with letter L : " +n +"\n");
		
		float e=-2.14748364823434f;   //float size is 4byte
		float r=2.14748364823434F;
		System.out.println("Minimum Value of float with letter f : " +e);
		System.out.println("Maximum value of float with letter F : " +r);
		System.out.println("We use float when number is in decimal and maximum value of integer is in decimal" +"\n");
		
		double s=2.14748364823434d;
		System.out.println("Value of double with size is 8 byte : " +s +"\n");
		
		char k='j';  //single character only whether it is 1,a or @
		System.out.println("only one value of char : " +k +"\n");
	}
	
	public static void main(String[] args) {
		System.out.println("Primitive Datatypes in Java :" +"\n");
		Datatypes d= new Datatypes();
		d.dt();
	}

}


