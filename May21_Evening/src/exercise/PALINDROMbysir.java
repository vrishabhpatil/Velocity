package exercise;

import java.util.Scanner;

public class PALINDROMbysir {
	public void pali() {
		Scanner x= new Scanner(System.in);
		System.out.println("To check no. is paliendrom or not");
		System.out.println("enter the no.");
		long v= x.nextLong();
		x.close();
		long a;
		long b=0;
		long y = 0;
		y=v;                // value of v is stored in y becoz at line 22 we need to compair b and v
		System.out.println(y);
		while(y>0) {        // 154 ,15 ,1
			a = y%10;       // 4 ,5 ,1
			b = b*10 +a ;   // 0+4 ,4*10 +5=45 , 45*10+1=451  .......
			y=y/10;         // 15 ,1,0
		}
		
		if (b==v) {         // we cant give b==y as value of y is change
			System.out.println("It is paliendrom number" +b);
		}
		else {
			System.out.println("It is not paliendrom number"+b);
		}
		
}
	public static void main(String[] args) {
		PALINDROMbysir z=new PALINDROMbysir();
		z.pali();
	}
	
}
