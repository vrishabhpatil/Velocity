package firstprogram;

public class Shiftoperator {
	int a= 10;
	int b=20;
	public void leftshift() {
		System.out.println(a<<2); //10* 2^2 = 10*4 =40
		System.out.println(a<<3); //10* 2^3 =10*8  =80
		System.out.println(a<<4); //10*2^4  =10*16 =160
		
		System.out.println(b<<2); //20*2^2 =20*4 =80
		System.out.println(b<<3);//20*2^3=20*8 =160
		
		
	}
	public void rightshift() {
		System.out.println(a>>2); // 10/2^2 =10/4 =2 shows quotient
		System.out.println(a>>3);// 10/2^3 =10/8  =1
		System.out.println(b>>2);// 20/2^2 =20/4  =5 
		System.out.println(b>>3);// 20/2^3 =20/8  =2
		
		
		System.out.println(a>>>2);//10/2^2 =10/4=2 (NO difference) 
		System.out.println(a>>>3); //10/2^3=10/8=1
	}
	public static void main (String[]args) {
		Shiftoperator v =new Shiftoperator();
		v.leftshift();
		v.rightshift();
	}

}
