package controlstatement;

import java.util.Scanner;

public class ScannerStatement {
	static String s;
	static int z;
	
	public void scan() {
		Scanner v =new Scanner(System.in);
		
		System.out.println("enter username");
		String s =v.nextLine();
		System.out.println("enter password");
		int z = v.nextInt();
		v.close(); // neeed to close when multiple statement is there
		System.out.println(s);
		System.out.println(z);
	
	}
//	public void compair() {
	//	if(s=="vrishabh") {
	//		if(z==123) {
	//			System.out.println("jhjhj");
	//		}
	//	}
	//}
		
	public static void main(String[] args) {
		ScannerStatement x =new ScannerStatement ();
		x.scan();
		//x.compair();
	
	}

}
