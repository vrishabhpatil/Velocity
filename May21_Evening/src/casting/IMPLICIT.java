package casting;

public class IMPLICIT {
	int a=10;
	public void imp() {
		long b=a;
//		lower datatype is coverted into higher datatype
//		widing or automatic conversion
		System.out.println(b);
	}
	public void upcasting() {
		System.out.println("super class property");
	}
	public static void main(String[] args) {
		IMPLICIT y=new IMPLICIT();
		y.imp();
	}

}
