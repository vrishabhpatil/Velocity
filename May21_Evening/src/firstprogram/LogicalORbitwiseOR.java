package firstprogram;

public class LogicalORbitwiseOR {
	int a= 50;
	int b=75;
	int c=100;
	public void logicalOR () {
		
		//logicalOR operator does not check 2nd condition if 1st is true
		//its checks 2nd only if 1st is false
		//if there is one from the both condi. is true output is true
		
		System.out.println(a<b || b>a);	//true && true   =t
		System.out.println(a>b || b>a);	//false && true  =t
		System.out.println(a>c || b>c);	//false && false =f
		System.out.println(a<c || c<b);	//true && false  =t
	}
	
	public void BitwiseOR () {
		
		//bitwisOR operator always checks 2nd condition whether it is true or false
		//faltu shahanpan
		System.out.println(a<b | b>a);	//true && true   =T
		System.out.println(a>b | b>a);	//false && true  =T
		System.out.println(a>c | b>c);	//false && false =f
		System.out.println(a<c | c<b);	//true && false  =T
	}
	public static void main(String[]args) {
		LogicalORbitwiseOR v = new LogicalORbitwiseOR();
		v.logicalOR();
		v.BitwiseOR ();
	}

}
