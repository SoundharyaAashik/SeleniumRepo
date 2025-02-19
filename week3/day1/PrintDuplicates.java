package week3.day1;

public class PrintDuplicates {

	public static void main(String[] args) {
		//		   0  1  2  3  4  5  6  7	
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		
		for (int i = 0; i < num.length; i++) {			
		
			for (int j = i+1; j < num.length; j++) {
				
				if (num[j]==num[i]) {
					System.out.println(num[j]);						
				}			
			}			
		}
	}
}