package loopstatement;

import java.util.Scanner;

public class EvenNO {
	int a;
	int b;
	public void even() {
		Scanner x = new Scanner(System.in);
		System.out.println("enter the number");
		long v=x.nextLong();  //here i use long becoz range is high
		if(v %2 ==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}
	public static void main(String[] args) {
		EvenNO y =new EvenNO();
		y.even();
	}

}
