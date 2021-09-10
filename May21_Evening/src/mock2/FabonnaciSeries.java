package mock2;

 public  class  FabonnaciSeries {
public void fabo() {
    int a=0;     //1,2,3,5
	int b=1;
	int c;
	int n=10;
	for(int j=1;j<=n;j++) {
		
		c=a+b;  
		
	       a=b;
	       b=c;
	       System.out.println(c);
	}
}

public static void main(String[] args) {
	FabonnaciSeries v=new FabonnaciSeries();
	v.fabo();
}
}