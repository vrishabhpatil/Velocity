package abstraction;

public class ConcreteClass extends AbstractClass{

	@Override
	public void test() {
		System.out.println("test result");
	}

	@Override
	public void test1() {
		System.out.println("test1 result");
		
	}

	@Override
	public void test2() {
		System.out.println("test2 result");
	}
public static void main(String[] args) {
	ConcreteClass v=new ConcreteClass();
	v.test();
	v.test1();
	v.test2();
}
}
