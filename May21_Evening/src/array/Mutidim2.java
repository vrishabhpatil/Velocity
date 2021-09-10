package array;

import java.util.Arrays;

public class Mutidim2 {
public static void main(String[] args) {
	String s[]= {"vivo","mi","samsung","apple"};
	
	for(String i:s) {
		System.out.println(i);
	}
	
	System.out.println("======alphabetically======");
	Arrays.sort(s);
	for(int i=0; i<s.length;i++) {
		System.out.println(s[i]);
	}
}
}
