package week3.homeassignments.javaprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		// check if length is same
		if(text1.length()==text2.length()) {

			//convert strings to char array 
			char[] char1 = text1.toCharArray();
			char[] char2 = text2.toCharArray();

			//sort the array
			Arrays.sort(char1);
			Arrays.sort(char2);

			//check if the array is equal
			boolean result = Arrays.equals(char1, char2);
			if(result) {
				System.out.println("The given strings are Anagram.");
			}else
			{
				System.out.println("The given strings are not an Anagram.");
			}

		}else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

	}

}
