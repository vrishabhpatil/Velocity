package firstprogram;

public class Operators {
 static int a =100;
 int b = 15;
 boolean t=false;
 
 public void unary() { //postfix
	System.out.println(a);//100
	System.out.println(a++);//100 (++ = 1+)
	System.out.println(a--);//101  (-- = -1)
	System.out.println(a);//100  (-1+101)
	System.out.println(~a); // -value-1  =-100-1= -101
	System.out.println(!t); // !operator invert the value stored in t i.e true
	
 }
 public void prefix() {
	 System.out.println(a);//100
	 System.out.println(++a);//101
	 System.out.println(--a);//100
	 
	 
	 System.out.println(+a);//100
	 System.out.println(-a);//-100
 }
 public void Arithmatic() {
	 System.out.println(a+b);
	 System.out.println(a-b);
	 System.out.println(a*b);
	 System.out.println(a/b);// shows quotient
	 System.out.println(a%b);// shows remainder
 }
 
public static void main (String[]args) {
	Operators v = new Operators();
	v. unary();
	v.prefix();
	v.Arithmatic();
}
}
