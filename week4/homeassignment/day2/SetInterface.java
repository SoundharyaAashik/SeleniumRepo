package week4.homeassignment.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		String companyName = "google";
		char[] chr = companyName.toCharArray();
		
		// Using LinkedHashSet to store unique characters
		Set<Character> company = new LinkedHashSet<Character>();
		// Iterating through each character and adding to the Set
		for (Character ch : chr) {
			company.add(ch);
		}	
		// Converting Set to String using StringBuilder
		StringBuilder result = new StringBuilder();
		for (char ch : company) {
			result.append(ch);
		}
		System.out.println("The unique charcters from the String: "+result.toString());		
	} 

}
