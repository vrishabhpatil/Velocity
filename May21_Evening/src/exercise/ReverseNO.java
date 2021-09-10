package exercise;

import java.util.Scanner;

public class ReverseNO {
	public void pali() {
		Scanner x= new Scanner(System.in);
		System.out.println("Reverse of number");
		System.out.println("enter the no.");
		long v= x.nextLong();
		x.close();
		long a;
		long b=0;
		while(v>0) {//154 ,15 ,1
			a = v%10;    //4 ,5 ,1
			b = b*10 +a ;  //0+4 ,4*10 +5=45 , 45*10+1=451
			v=v/10;        //15 ,1,0
		}
		System.out.println(b);
	}
	public static void main(String[] args) {
		ReverseNO z=new ReverseNO();
		z.pali();
	}

}
