package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int i,n=20,count,j;
	    
	     for(j=2;j<=n;j++){
	        count=0;
	         for(i=1;i<=j;i++){
	            if(j%i==0){
	               count++;
	            }
	         }
	         if(count==2)
	             System.out.println("Prime: "+j+" ");   
	         else {
	        	 System.out.println("Non Prime: "+j+" ");
	         }
	}	
	     
}
}
