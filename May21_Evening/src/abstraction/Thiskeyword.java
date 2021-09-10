package abstraction;

public class Thiskeyword {
int a=10;
int b=20;

public void add() {
	int a=30;
	int b=40;
	System.out.println(a);
	System.out.println(b);
	System.out.println(this.a);   
	System.out.println(this.b);
	
	// this keyword is used to access global variable in method when same local variable
	// name is present
}
public static void main(String[] args) {
	Thiskeyword v= new Thiskeyword();
	v.add();
		
	
}
}
