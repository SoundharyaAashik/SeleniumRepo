package week4.homeassignment.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindMissingElementusingList {

	public static void main(String[] args) {
		// Declare an Integer array
		Integer[] a = {1, 2, 3, 4, 10, 6, 8};
		//Convert array to list
		List<Integer> num = new LinkedList<Integer>(Arrays.asList(a));
		//Sort in ascending order 0	1 2 3 4 5 6
		Collections.sort(num); //{1,2,3,4,6,8,10}
		System.out.print("Missing numbers are: ");
		for (int i = 0; i < num.size()-1; i++) { //0 1 2 3 4 5
			int current = num.get(i);  //1 2 3 4
			int next = num.get(i+1);   //2 3 4 10
			 //Check for missing elements
			for (int j = current+1; j < next; j++) { // 5<6 7<8 9<10
				System.out.print(j +" ");
			}
			
			

		}
	}
}