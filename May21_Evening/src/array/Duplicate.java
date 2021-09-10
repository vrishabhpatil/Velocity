package array;

public class Duplicate {
    public static void main(String[]args) {
    	String s[]= {"vrishabh","patil","velociy","java","shri","vrishabh","patil","shri"};
       System.out.println(s.length);
       
    	for (int i = 0; i <s.length-1; i++) {
			for (int j = i+1; j<s.length;j++) {
				if(s[i].equals(s[j]) && (i!=j)){
					System.out.println("Duplicates Infomation is :- "+s[j]);
				}
			}
		}
    }
}
