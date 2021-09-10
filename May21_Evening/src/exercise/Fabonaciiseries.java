package exercise;

import java.util.Scanner;

public class Fabonaciiseries {
	public void fabo() {
		Scanner x=new Scanner(System.in);
		
		System.out.println("fabonacii Series");
		System.out.println("enter the number upto which series requied");
		int v=x.nextInt();
		x.close();
		int a=0;
		int b=1;
		int c;  
		
		for(int i=1;i<v;i++) {
          
		
			c=a+b ;                 //  a + b= c
			System.out.println(c);  //  1   2  3  5   8   13
		      a=b;                  //      a+ b= c
		      b=c;
		
		}
	}
	public static void main(String[] args) {
		Fabonaciiseries v=new Fabonaciiseries();
		v.fabo();
	}

}
