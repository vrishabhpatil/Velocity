package exercise;

import java.util.Scanner;

public class Primeno {
	int a;
	long remainder=0;
	public void prime() {
	Scanner x = new Scanner(System.in); //dont forget to enter system.in
	System.out.println("To check number is prime or not");
	System.out.println("Enter the number");
	 long v =x.nextLong();
	 x.close();
	 for(int i=2; i<v;i++) {  //2
		 if(v%i==0) {
			 remainder=remainder+1;    //if any number is fully divisible then remainder have some value
		 }
	 }
	if(remainder==0) {     //if number between (2 to value) is not divisible then value of remainder
		                   // is zero
		System.out.println("It is a prime number");
	}
	else {
		System.out.println("It is not prime number");
		System.out.println(remainder);
	}
	 		
		
	}
	
	public static void main(String[] args) {
		Primeno y =new Primeno();
		y. prime();
	}
}
