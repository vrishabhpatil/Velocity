package casting;

import accessSpcifier.Default;

public class Upcasting extends IMPLICIT {
	
	
    // Before upcasting inheritance must takes place
	// only properties which are inhering from super class are eligible
	// assign property of subclass into superclass
	
	public void up() {
		System.err.println("subclass property");
	}
	
	
	public static void main(String[] args) {
		IMPLICIT y =new Upcasting();
//		y.up();       not possible
		y.imp();
		y.upcasting();
		
//		Default x=new Default();   from access specifer
//		x.access();
	}
}
