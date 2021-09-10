package exercise;

import java.util.Scanner;

public class Factorial {
public void fact() {
	long j=1;
	Scanner x=new Scanner(System.in);
	System.out.println("TO find factorial of number");
	System.out.println("enter the number");
	int v=x.nextInt();
	x.close();
	for(int i=1;i<=v;i++) {
	
		j = j*i;
		
	}
	System.out.println("factorial of the no.is"  +  j);
}
public static void main(String[] args) {
	Factorial z=new Factorial();
	z.fact();
}
}
