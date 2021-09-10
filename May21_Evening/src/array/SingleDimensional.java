package array;

import java.util.Arrays;

public class SingleDimensional {
public static void main(String[] args) {
	int a[]= new int [5];
	a[0]=10;
	a[1]=35;
	a[2]=25;
	a[3]=18;
	a[4]=14;
	
	// a[5]=15;  if provided throws java.lang.ArrayIndexOutOfBoundsException
	System.out.println(a[1]);
	for(int i=0;i< a.length ;i++) {
		System.out.println(a[i]);
	}
	System.out.println("----Asending order--- ");
	Arrays.sort(a);
	for(int i=0;i< a.length ;i++) {
		System.out.println(a[i]);
	}
	
	System.out.println("---Desending order---");
	Arrays.sort(a);
	for(int i= a.length-1 ;i>=0; i--) {
		System.out.println(a[i]);
	}
}
}
