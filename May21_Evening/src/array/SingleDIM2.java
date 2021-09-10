package array;

import java.util.Arrays;

public class SingleDIM2 {
public static void main(String[] args) {
	
	String s[]= new String[5];
	s[0]="vrishabh";
	s[1]="Ravindra";
	s[2]="Dnyandeo";
	s[3]="tukaram";
	s[4]="patil";
	
	for(int i=0; i< s.length;i++) {
		System.out.println(s[i]);
	}
	System.out.println(" ");
	Arrays.sort(s);
	for(int i=0; i< s.length;i++) {
		System.out.println(s[i]);
	
}
}
}
