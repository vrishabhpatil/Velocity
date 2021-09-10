package exercise;



public class PRIME1to100 {
	
		
		public void prime() {
			System.out.println(" prime numbers are");
		for(int n=1;n<100;n++) {
			
		long remainder=0;
		
		 for(int i=2; i<n;i++) {  
			 if(n%i==0) {
				 remainder=remainder+1;   
			 }
		 }
		 
		if(remainder==0) {     
			
			System.out.print(n +" ");
		}
		
		 }
	
		}
		public static void main(String[] args) {
			PRIME1to100 y =new PRIME1to100();
			y. prime();
		}
	}


