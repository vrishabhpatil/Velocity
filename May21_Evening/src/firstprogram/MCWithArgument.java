package firstprogram;

public class MCWithArgument {
	int a=20;
	static String b="vrishabh patil";
	int c =50;
	
	public static void name(int z) {
		System.out.println(b);
		System.out.println("age="+z);
		
	}
	public static void name(String S){   //method overloading
		                           
		int a=20;
		System.out.println(S);
		System.out.println("age="+a);
	}
	public void add(int x) {
		System.out.println(a+c);
	}
	public static void main (String[]agrs) {
		name(23);
		name("Alia Bhatt");
		MCWithArgument c=new MCWithArgument();
		c.add(0);
	}
 
}
