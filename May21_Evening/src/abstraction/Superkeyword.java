package abstraction;

public class Superkeyword extends Thiskeyword{
int a=100;
int b=200;

// super keyword is used to access the same variable with same from other class in method
// variable overriding is happen

   public void input() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(super.a);
	System.out.println(super.b);
}
     public static void main(String[] args) {
    	 Superkeyword v= new Superkeyword();
    	 v.input();
	}
}
