package abstraction;

public class ImplementationClass implements Interface ,Interface2{
        //multiple inheritance takes place
	@Override
	public void idli() {
		System.out.println("idli price is 30");
	}

	@Override
	public void dosa() {
		System.out.println("dosa price is 30");
	}

	@Override
	public void vadapav() {
		System.out.println("vadapav price is 20");		
	}
	public static void main(String[] args) {
		ImplementationClass v= new ImplementationClass();
		v.idli();
		v.dosa();
		v.vadapav();
	}

	@Override
	public void bhaje() {
			
	}

	@Override
	public void samosa() {
	
	}

	@Override
	public void noodles() {
		
	}

}
