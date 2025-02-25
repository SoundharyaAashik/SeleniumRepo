package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Declare empty Set
		//Set<String> mentors = new HashSet<String>(); //Random Order
		//Set<String> mentors = new TreeSet<String>(); //ASCII Order
		Set<String> mentors = new LinkedHashSet<String>();  //Insertion Order
		System.out.println("The Set is: "+mentors);
		//add mentors name
		mentors.add("Soundharya");
		mentors.add("Rajendran");
		mentors.add("Aashik");
		mentors.add("Ishaan");
		System.out.println(mentors);
		
		mentors.remove("Rajendran");
		System.out.println(mentors);
		int size = mentors.size();
		System.out.println(size);
		
		Set<String> trainers = new LinkedHashSet<String>();
		System.out.println("This is and empty Set: "+trainers);
		trainers.addAll(mentors);
		System.out.println(trainers);
		//To retrieve an element
		// Convert Set to List, Then I can use "get" method
		
		List<String> allTrainers = new ArrayList<String>(trainers);
		System.out.println("The List is: "+allTrainers);
		System.out.println(allTrainers.get(1));
		
		
		
	}

}
