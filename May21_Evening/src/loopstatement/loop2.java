package loopstatement;

public class loop2 {
	public void vrp() {
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=i;j++) {     //1;1<=1;*
				                        //2;2<=1;false
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		loop2 x =new loop2();
		x.vrp();
	}

}
