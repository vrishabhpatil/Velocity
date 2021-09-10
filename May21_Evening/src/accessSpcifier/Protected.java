package accessSpcifier;

public class Protected {
// the scope of protected keyword is within package and out side the package
	// but condition is inheritance must takes place
	protected void prot() {
		System.out.println("scope is out side the package also");
	}
	public static void main(String[] args) {
		Protected v=new Protected();
		v.prot();
	}
}
         // to access out side package we need to make subclass (inheritance must take place)