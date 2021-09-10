package exercise;

import java.util.Scanner;

public class Armstrong {
	public void arm() {
		Scanner x =new Scanner (System.in);
		System.out.println("to check the no. is armstrong no. or not ");
		System.out.println("enter the number");
		int v=x.nextInt();
		x.close();
		int a;
		int t=0;
		int b=0;
		int c;
		c=v;
		while(c>0) { //153=1^3+5^3+3^3 =1+125+27 =153
			a=c%10;  //3,5,1
			b= a*a*a+t ; //3*3*3 +0 , 5*5*5+27,  1*1*1 +(125+27)
			c=c/10; //15,1
			t=b;     //value of b is stored in t
		}
		if(b==v) {
			System.out.println("It is armstrong number");
		}
		else {
			System.out.println("It is not a armstrong number");
		}
		
	}
	public static void main(String[] args) {
		Armstrong z=new Armstrong();
		z.arm();
	}

}
