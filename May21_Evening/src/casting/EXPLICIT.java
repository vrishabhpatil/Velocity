package casting;

public class EXPLICIT {
        long a=1012125565;
        //higher datatype converted into lower datatype
        //memory size decreses
        //narrowing or manual conversion
        
        public void exp() {
        	int b =(int) a;
        	System.out.println(b);
        }
        public void downcasting() {
        	System.out.println("property of superclass");
        }
        public static void main(String[] args) {
        	EXPLICIT y=new EXPLICIT();
        	y.exp();
		}
}
