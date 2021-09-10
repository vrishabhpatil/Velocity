package loopstatement;

public class Loop4 {
	int i;
	int j ;
	int k;
	
	public void vrp() {
		for(int i=1; i<=5;i++) {
			
			for(int j=i;j<5;j++) {   
		   System.out.print("  ");
		}
			
			for(int k=1;k<=i;k++) {
		System.out.print("* ");
	}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Loop4 x= new Loop4();
		x.vrp();
}
}