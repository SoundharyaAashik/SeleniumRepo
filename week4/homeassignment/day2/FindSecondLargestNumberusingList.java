package week4.homeassignment.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindSecondLargestNumberusingList {

	public static void main(String[] args) {
		//Initialize the array
		Integer[] a = {3, 2, 11, 4, 6, 7};
		//Convert array to list
		List<Integer> numbers = new LinkedList<Integer>(Arrays.asList(a));
		// Sort in ascending order
		Collections.sort(numbers);
		// Get the second largest number
		int size = numbers.get(numbers.size()-2);
		//Print the result
		System.out.println("Second largest number using list is "+size);
	}
}