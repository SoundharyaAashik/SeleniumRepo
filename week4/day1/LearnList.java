package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//List - Interface
		//ArrayList - Implementation Class	
		
		//Declare the Empty List
		List<String> learnersName = new ArrayList<String>();
		System.out.println("The List is: "+learnersName);
		
		//Add element to List
		learnersName.add("Soundharya");
		System.out.println("The List is: "+learnersName);
		
		//Add multiple names
		learnersName.add("Rajendran");
		learnersName.add("Aashik");
		learnersName.add("Ishaan");	
		learnersName.add("Ishaan"); //allows duplicates
		System.out.println("The List after adding multiple data: "+learnersName);
		
		//0				1			2		3		4
		//Soundharya  Rajendran   Aashik   Ishaan  Ishaan
		
		learnersName.add(3, "Ahamed");
		System.out.println(learnersName);
		learnersName.add(6, "Aarya");
		System.out.println(learnersName);
		//remove an element
		learnersName.remove(3);
		System.out.println("After Removing an element: "+learnersName);
		//Retrieving an element - get using Index
		String getData = learnersName.get(4);
		System.out.println("Retrieving an element: "+getData);
		
		//Size method
		int sizeOfList = learnersName.size();
		System.out.println("The size of the array is: "+sizeOfList);
		
		//Sort - To arrange in ASCII Order
		//Sort is not available in List level but available in Collections level
		Collections.sort(learnersName);
		System.out.println("List after Sorting:"+learnersName);
		
		//addAll - To add all elements from one list to another list
		List<String> employees = new ArrayList<String>();
		System.out.println("The employee list is: "+employees);
		
		//addAll
		employees.addAll(learnersName);
		System.out.println("The employee list names are: "+employees);
		
		//clear
		employees.clear();
		System.out.println("The employee list is: "+employees);
		
	}

}
