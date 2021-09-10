package controlstatement;

public class NestedIFelse {
	String u ="vrishabh123";
	int pwd =1234;
	public void login() {
		if(u=="vrishabh123") {
			if(pwd==1234) {
				System.out.println("logged in successfully");
			}
			else {
				System.out.println("you have entered wrong password/username");
			}
		}
		else {
			System.out.println("you have entered wrong password/username");
		}
		
	}
	public static void main(String[] args) {
		NestedIFelse v= new NestedIFelse();
		v.login();
	}

}
