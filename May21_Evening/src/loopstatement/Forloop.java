package loopstatement;

public class Forloop {
//syntax
	//intialization;condition;pre/post increment/decrement
	
	int a;
public void loop() {
	//for (a =0; a<=10;a++) {  //a++ = value (value+1)
	//	System.out.println(a);
	//}
	for (a =10; a>0;a--) {  //a-- = value (value-1)
		System.out.println(a);
	}
//	for (a =5; a<=10;++a) {  //++a = value (1+value)
	//	System.out.println(a);
	//}
	//for (a =10; a>-5;--a) {  //--a = value (1-value)
	//	System.out.println(a);
	//}
}
public static void main(String[] args) {
	Forloop v = new Forloop();
	v.loop();
}
}
