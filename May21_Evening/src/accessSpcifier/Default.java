package accessSpcifier;

public class Default {
   void access() {
	   System.out.println("default specifier");
	   System.out.println("scope is only within the package , NO KEYWORD for default");
   }
   public static void main(String[] args) {
	   Default x=new Default();
	   x.access();
	   
	   //trying outside package in package casting class(upcasting)
	   // showing [the method access() from the type Default is not visible] error
}
}
