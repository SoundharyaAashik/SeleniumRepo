package week3.homeassignments.javaprograms;

public class FindIntersection {

	public static void main(String[] args) {
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		//loop iterator from 0 to array length
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(b[j]==a[i]) { //compare the elements of array1 with the elements of array2
					System.out.print(b[j]+" ");					
				}				
			}

		}
	}
}
