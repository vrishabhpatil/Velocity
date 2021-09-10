package abstraction;

public abstract class AbstractClass {
	
	abstract public void test();
    abstract public void test1();
    abstract public void test2();
    
   /* abstract public static void test4();  */
    
    //abstract method cannot be static
    //because we overriding the methods in subclass and overriding is not possible in static method
    
    public static void finaltest() {
    	System.out.println("it have non abstract method also");
    }
}
