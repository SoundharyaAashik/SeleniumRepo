package week3.homeassignments.javaprograms;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] words = test.split(" ");
		String reverseword = " ";		
		String tmp = "";
		for (int i = 0; i < words.length; i++) {
			if(!(i%2==0)) {
				String word = words[i];
				for (int j = word.length()-1; j >= 0; j--) {
					reverseword = reverseword + word.charAt(j);
					tmp = "";
				}				
			}
			else {
				tmp += words[i];
			}			
			reverseword = reverseword + tmp + " ";		
		}
		System.out.println(reverseword);
	}

}
