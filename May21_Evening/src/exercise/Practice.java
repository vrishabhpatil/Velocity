package exercise;

public class Practice {
	public static void main(String []args){
        int n=153;
        int v=n;
        int a;
        int l=0;
        while(v>0){
              a=v%10;
           l= a*a*a +l;
           v=v/10;
             
      }
      if(n==l){
      System.out.println("armstrong no");
  }
       else{
    System.out.println("NOT armstrong no");
}
		   }
}
