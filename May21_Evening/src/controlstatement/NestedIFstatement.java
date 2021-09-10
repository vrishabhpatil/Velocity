package controlstatement;

public class NestedIFstatement {
	//nestedif means if condition inside if block
	
	public void vaccination() {
		int age= 15;
		if(age>18) {
			if(age<45) {
				System.out.println("you are eligible for 2nd phase of vaccination");
			}
			System.out.println("you are not eligible in 2nd phase of vaccination");
			
		}
		System.out.println("you are not eligible in 2nd phase of vaccination");
	}
	public static void main (String[]args) {
		NestedIFstatement v=new NestedIFstatement();
		v.vaccination();
	}

}
