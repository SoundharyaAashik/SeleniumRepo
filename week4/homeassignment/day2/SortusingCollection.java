package week4.homeassignment.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortusingCollection {

	public static void main(String[] args) {

		//Declaring string array
		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		//Converting array to List
		List<String> company = new ArrayList<String>(Arrays.asList(companies));
		//Sort the List
		Collections.sort(company);
		//Reverse loop to iterate the collection
		for (int i = companies.length-1; i>=0 ; i--) {
			System.out.print(company.get(i));
			//print comma except the last element
			if(i!=0) {
				System.out.print(", ");
			}
		}
	}
}