package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		//interface<wrapperClass> listName  =  new implementationclass<> ();
		List<String> mentors = new ArrayList<String>();
		mentors.add("Harrish");
		mentors.add("Vineeth");
		mentors.add("Bhuvanesh");
		mentors.add("Seenivasan");
		mentors.add("Anburaj");
		mentors.add("Bhuvanesh");
		mentors.remove(2);
		String value1 = mentors.get(0);
		System.out.println(value1);
		boolean value3 = mentors.contains("Vineeth");
		System.out.println(value3);
		//mentors.clear();
		Collections.sort(mentors);
		int size = mentors.size();
		System.out.println("********");
		mentors.forEach(System.out::println);
		System.out.println("-------- traditional for Loop------");
		for (int i = 0; i < size; i++) {
			System.out.println(mentors.get(i));
		}
		System.out.println("--------forEachLoop------");
		for (String string : mentors) {
			System.out.println(string);
		}
		
	}

}
