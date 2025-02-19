package week3.homeassignments.javaprograms;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] c1 = test.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			if(!(i%2==0)) {
				//System.out.println(c1[i]);
				System.out.print(Character.toUpperCase(c1[i]));
			}else
			{
				System.out.print(c1[i]);
			}			
		}
	}
}
