package controlstatement;

public class IFstatement {
	//syntax   if (condition){}
	public void eligibility() {
   int age = 19;
    if(age>18) {
	System.out.println("you are eligible for vaccintion");
	
	}
    System.out.println("you are not eligible for vaccination"); //here both is printed in output
	}
	public static void main(String[]args) {
		IFstatement v =new IFstatement();
		v.eligibility();
	}
	
}
