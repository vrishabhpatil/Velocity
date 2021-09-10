package controlstatement;

public class ELSEIFstaement {
	int marks =78;
	public void result() {
		if (marks>80) {
			System.out.println("first class with distiction");
		}
		else if (marks>70 && marks<=80) {
			System.out.println("first class");
		}
		else if (marks>60 && marks<=70) {
		System.out.println("higher second class");
		}
		else if (marks>50 && marks<=60) {
			System.out.println("second class");
	}
		else if (marks>40 && marks<=50) {
			System.out.println("PASS");
}
		else if (marks<40) {
			System.out.println("Fail");
}	
}
	public static void main (String[]args) {
		ELSEIFstaement v = new ELSEIFstaement();
		v.result();
		}
}