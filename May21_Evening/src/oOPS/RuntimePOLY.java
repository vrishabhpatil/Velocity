package oOPS;

public class RuntimePOLY extends Father {
public void land() {
	System.out.println("5000sqft");
	
	// method over riding
	//method declared in subclass is same as method declared in parent class 
}
public static void main(String[] args) {
	RuntimePOLY v = new RuntimePOLY();
	v.land();
	Father u=new Father();
	u.land();
	//runtime polymorphism
	// executing method by creating object w.r.t their class
}
}
