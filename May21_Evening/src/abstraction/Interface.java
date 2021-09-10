package abstraction;

public interface Interface {
	int a=50;               //variable is static always
	
  public void idli();
  public void dosa();
  public void vadapav();
  
 // public static void pavbhaji();     not possible
  
  public static void pavbhaji() {
	  System.out.println("price is="+a);
  }
  //public void upma() {}     Abstract methods do not specify a body
  
  public static void main(String[] args) {
	  pavbhaji();
	  
}
}
