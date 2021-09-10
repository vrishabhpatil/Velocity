package abstraction;

public class MainEncapsulation  {

	public static void main(String[] args) {
		Encapsulation v = new Encapsulation();
		v.setname("vrishabh");
		v.setid("123");
		v.setage(23);
		
	  String s= v.getname();
	  String t=v.getid();
	    int u  =v.getage();
	    
	    System.out.println(s);
	    System.out.println(t);
	    System.out.println(u);
	}
}

