package firstprogram;

public class Methodcalling {
	int a=10;
	static String b="vrishabh patil";
	int c =20;
	public static void name() {
		System.out.println(b);
		
	}
	public void add() {
		System.out.println(a+c);
	}
	public static void main (String[]agrs) {
		name();     //methodcalling within theclass
		Methodcalling v = new Methodcalling();
		v.add();
	}

}
