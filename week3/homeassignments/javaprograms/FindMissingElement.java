package week3.homeassignments.javaprograms;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] arr = {1, 4,3,2,8,6,7};	
		//sorting the array
		Arrays.sort(arr); // 1 2 3 4 6 7
		
		int n = arr.length + 1; // Total count including the missing number
		for(int i=1;i<n;i++) {
			boolean element = false;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==i) {
				element = true;
					break;
				}						
			}
			if(!element) {
				System.out.println(i);
			}
		}
	}
}