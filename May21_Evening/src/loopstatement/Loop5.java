package loopstatement;

public class Loop5 {
	int i;
	int j ;
	int k;
	
	public void vrp() {
		for(int i=1; i<=5;i++) {
			for(int j=i;j<5;j++) {   
		   System.out.print("  ");
		}
			for(int k=1;k<=i;k++) {
		System.out.print("*   ");
	}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Loop5 x= new Loop5();
		x.vrp();
}
}
