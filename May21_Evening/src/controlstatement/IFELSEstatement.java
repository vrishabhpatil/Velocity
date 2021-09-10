package controlstatement;

public class IFELSEstatement {
	int age=60;
	public void busconsession() {
		if(age>=60) {
			System.out.println("you get 50% consession on bus ticket");
		}
		else {
			System.out.println("you are not eligible for consession");
		}
	}
	public static void main(String[]args) {
		IFELSEstatement v=new IFELSEstatement();
		v.busconsession();
	}

}
