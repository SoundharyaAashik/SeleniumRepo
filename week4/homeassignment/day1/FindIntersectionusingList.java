package week4.homeassignment.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindIntersectionusingList {

	public static void main(String[] args) {
	
		//Declare array
		Integer[] a = {3, 2, 11, 4, 6, 7};
		Integer[] b = {1, 2, 8, 4, 9, 7};
		//Add array elements to a list
		List<Integer> ListA = Arrays.asList(a);
		List<Integer> ListB = Arrays.asList(b);
			
		List<Integer> intersection = new ArrayList<Integer>();
		for (Integer number : ListA) {
            if (ListB.contains(number) && !intersection.contains(number)) {
            	intersection.add(number);
            	}
			
		}
		//Print the intersection
        System.out.println("Common elements are: " + intersection);
	}
}
	
