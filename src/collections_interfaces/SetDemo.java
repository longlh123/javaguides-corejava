package collections_interfaces;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		//Create a HashSet
		Set<String> daysOfWeek = new HashSet<>();
		
		//Add new elements to the HashSet
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
		
		System.out.println(daysOfWeek);
		
		LinkedHashSet<String> monthsOfYear = new LinkedHashSet<>();
		
		//Add new element to the LinkedHaskSet
		monthsOfYear.add("January");
		monthsOfYear.add("February");
		monthsOfYear.add("March");
		monthsOfYear.add("April");
		monthsOfYear.add("May");
		monthsOfYear.add("June");
		monthsOfYear.add("July");
		monthsOfYear.add("August");
		monthsOfYear.add("September");
		monthsOfYear.add("October");
		monthsOfYear.add("November");
		monthsOfYear.add("December");
		
		System.out.println(monthsOfYear);
		
		//Create a TreeSet
		TreeSet<String> fruits = new TreeSet<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		System.out.println(fruits);
		
		//Create a TreeSet
		SortedSet<String> fruits_2 = new TreeSet<>();
		
		fruits_2.add("Banana");
		fruits_2.add("Apple");
		fruits_2.add("Pineapple");
		fruits_2.add("Orange");
		
		System.out.println(fruits_2);
		
		//Returns the first (lowest) element currently in this set.
		String first = fruits_2.first();
		System.out.println("The first (lowest) element currently in this set: " + first);
		
		//Returns the last (highest) element currently in this set.
		String last = fruits_2.last();
		System.out.println("The last (highest) element currently in this set: " + last);
		
		//Returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements.
		Comparator<?> comparator = fruits_2.comparator();
		
		System.out.println(comparator);
		
		//Returns a view of the portion of this set whose elements are greater than or equal to fromElement
		SortedSet<String> tailSet = fruits_2.tailSet("Banana");
		System.out.println(tailSet);
	}
}
