package firstprogram;

public class MCfromdiffCLASS {
	int a=20;
	static String b="vrishabh patil";
	int c =50;
	public static void name() {
		System.out.println(b);
		
	}
	public void add() {
		System.out.println(a+c);
	}
	public static void main (String[]agrs) {
		name();     
		MCfromdiffCLASS v = new MCfromdiffCLASS();
		v.add();
		Methodcalling.name(); //CALLING STATIC METHOD FROM Different class
		Methodcalling m =new Methodcalling();// calling non static method from
		//different class
		m.add();
	}


}
