package casting;

public class Downcasting extends EXPLICIT {
       // before doencasting upcasting is done (neccessery)
	   // property of superclass acquired to subclass
	
	public void down() {
		System.out.println("property of subclass"); 
	}
	public static void main(String[] args) {
	   EXPLICIT y =new Downcasting ();      //upcasting is done
	   
	//  Downcasting z=new EXPLICIT();    
	 /*  down casting done implicitly but we need to convert  higher infomation to lower */
	   
	   Downcasting z=( Downcasting)y;  //explicitly
	       z.down();
	       z.downcasting();
	       z.exp();
	}
}
