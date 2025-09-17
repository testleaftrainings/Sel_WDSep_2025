package week3.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//interface<wrapperClass> listName  =  new implementationclass<> ();
		// set will not allow the duplicate values
		// insertion order --> LinkedHashSet
		Set<String> mentors = new LinkedHashSet<String>();
		mentors.add("Harrish");
		mentors.add("Vineeth");
		mentors.add("Bhuvanesh");
		mentors.add("Seenivasan");
		mentors.add("Anburaj");
		mentors.add("Bhuvanesh");
		mentors.forEach(System.out::println);
		// ASCCI order --> TreeSet
		Set<String> mentors1 = new TreeSet<String>();
		mentors1.add("Harrish");
		mentors1.add("Vineeth");
		mentors1.add("bhuvanesh");
		mentors1.add("Seenivasan");
		mentors1.add("anburaj");
		mentors1.add("Bhuvanesh");
		System.out.println("---TreeSet---");
		mentors1.forEach(System.out::println);
		// .get() can be only using List
		// convert the Set into List
		List<String> mentorsList = new ArrayList<String>(mentors1);
		String string = mentorsList.get(0);
		System.out.println(string);
		System.out.println("---convert the Set into List---");
		mentorsList.forEach(System.out::println);
		
		
	}

}
