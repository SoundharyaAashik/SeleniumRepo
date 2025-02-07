package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	
		int input = 35534, output = 0;

	    for(int temp = input;temp > 0;temp/=10)
	    {	    
	    	output = output * 10 + temp % 10;	    	
	    }
	   
		
		  if(input==output) { System.out.println("Given number is a Palindrome"); }else
		  { System.out.println("Given number is not a Palindrome"); }
		 
	}

}
