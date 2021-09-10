package exercise;

import java.util.Scanner;

public class Palindrome {
	public void compair() {
	Scanner x=new Scanner(System.in);
	System.out.println("TO check the given no.palindrom or not valid for 2 digit only");
	System.out.println("enter the number");
	int v=x.nextInt();
	x.close();
	int b=v/10;     //22/10=2
	int c=v-b;      //22-2=20
	int d=c/10;     //20/10=2
	
	int e = d*10 + b;
	if(e==v) {
		System.out.println("It is paliendrom no.");
	}
	else {
		System.out.println("It is not paliendrom no.");
	}
	}
	public static void main(String[] args) {
		Palindrome z= new Palindrome();
		z.compair();
	}
}
