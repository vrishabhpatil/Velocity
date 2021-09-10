package firstprogram;

public class MCWAfromDIFFclass {
 static int a=10;
 static int b=250;
 static String s="jay mata di";
  public static void god(int c) {
	  System.out.println(s);
	  
  }
  public void div(int d) {
	  System.out.println(b/a);
	 
  }
  public static void main (String []args) {
	  god(1);
	  MCWAfromDIFFclass v= new MCWAfromDIFFclass();
	  v.div(0);  //calling method with argument within class
	  MCWithArgument.name(23); //calling static method with argument 
	                           //from different class
	  MCWithArgument y=new   MCWithArgument();
	  y.add(0);
  }
}
