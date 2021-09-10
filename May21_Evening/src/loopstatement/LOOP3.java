package loopstatement;

public class LOOP3 {
public void vrp() {
	for(int i=1; i<=5;i++) {
		for(int j=5;j>=i;j--) {   //1;1<=5;*
			                      //2;2<=5;*    becaz of print statement * will print in single line
			System.out.print("* "); 
			
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	LOOP3 x= new LOOP3();
	x.vrp();
	
}
}
