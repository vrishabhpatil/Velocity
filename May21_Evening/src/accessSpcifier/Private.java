package accessSpcifier;

public class Private {
 private void access() {
	 System.out.println("private specifier");
	 System.out.println("scope only within class, cant access outside the class");
 }
 public static void main(String[] args) {
	 Private x =new Private();
	 x.access();
}
}
