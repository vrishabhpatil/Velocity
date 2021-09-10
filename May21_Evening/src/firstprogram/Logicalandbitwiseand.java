package firstprogram;

public class Logicalandbitwiseand {
	int a= 50;
	int b=75;
	int c=100;
	public void logicaland () {
		
		//logical&& operator does not check 2nd condition if 1st is false
		//its checks 2nd only if 1st is true
		//if there is one from the both condi. is false output is false
		
		System.out.println(a<b && b>a);	//true && true   =t
		System.out.println(a>b && b>a);	//false && true  =f
		System.out.println(a>c && b>c);	//false && false =f
		System.out.println(a<c && c<b);	//true && false  =f
	}
	
	public void Bitwiseand () {
		
		//bitwiseand operator always checks 2nd condition whether it is true or false
		//faltu shahanpan
		System.out.println(a<b & b>a);	//true && true   =t
		System.out.println(a>b & b>a);	//false && true  =f
		System.out.println(a>c & b>c);	//false && false =f
		System.out.println(a<c & c<b);	//true && false  =f
	}
	public static void main(String[]args) {
		Logicalandbitwiseand v = new Logicalandbitwiseand();
		v.logicaland();
		v.Bitwiseand ();
	}
	}

