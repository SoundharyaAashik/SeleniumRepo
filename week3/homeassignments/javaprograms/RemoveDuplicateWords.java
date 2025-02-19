package week3.homeassignments.javaprograms;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
					// 0	1	2	3	 4	   5    6	  7	
		String text = "We learn Java basics as part of java sessions in java week1";
        String[] words = text.split(" "); // Split the string into words
        int count;
        
        for (int i = 0; i < words.length; i++) {
            count = 1;
            if (!words[i].equals("")) { // Check if the word is not already replaced
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) { 
                        words[j] = " "; // Replace duplicate word with an empty string
                        count++;
                    }
                }
            }
        }       
        // Print the modified array without duplicates
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                System.out.print(words[i] + " ");
            }
        }
	}
}



