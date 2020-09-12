package collections_interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		nullValueDemo();
		duplicateValueDemo();
		positionalAccess();
		rangeViewDemo();
		bulkOperationsDemo();
		iterateOverDemo();
		iteratorListDemo();
		createAnArrayListFromCollectionDemo();
	}
	
	private static void nullValueDemo() {
		
		List<String> list = new ArrayList<>();
		list.add(null);
		list.add(null);
		
		System.out.println("ArrayList class can contains null values: " + list);
	}
	
	private static void duplicateValueDemo() {
		List<String> list = new ArrayList<>();
		list.add("duplicate");
		list.add("duplicate");
		
		System.out.println("ArrayList class can contains duplicate values: " + list);
	}
	
	private static void positionalAccess() {
		
		List<String> list = new LinkedList<>();
		
		for(int i = 1; i <= 5; i++) {
			list.add("element " + i);
		}
		
		//Iterating over the LinkedList using forEach()
		System.out.println("Iterating over the LinkedList using forEach()");
		
		list.forEach(name -> {
			System.out.println(name);
		});
		
		//Replaces the element at the specified position in this list with the specified element (optional operation)
		list.set(3, "element 5");
		
		System.out.println("Replaces the element at the specified position in this list with the specified element (optional operation)");
		
		list.forEach(name -> System.out.println(name));
		
		//Returns the element at the specified position in this list
		System.out.println("Returns the element at the specified position in this list: " + list.get(2));
		
		//Removes the element at the specified position in this list
		System.out.println("Removes the element at the specified position in this list (optional operation): ");
		list.remove(1);
		
		list.forEach(name -> System.out.println(name));
		
		//Returns the index of the first occurrence of the specified element in this list 
		//or -1 if this list does not contain the element
		
		int index = list.indexOf("element 4");
		
		System.out.println("Returns the index of first occurrence of the forth element 'element 4' in this list: " + index);
		
		index = list.indexOf("element 5");
		
		System.out.println("Returns the index of the first occurrence of the fifth element 'element 5' in this list: " + index);
		
		//Returns the index of the last occurrence of the specified element in this list
		//or -1 if this list does not contain the element
		index = list.lastIndexOf("element 5");
		
		System.out.println("Returns the index of the last occurrence of the fifth element 'element 5' in this list: " + index);
	}
	
	private static void rangeViewDemo() {
		
		List<String> list = new LinkedList<>();
		
		for(int i = 1; i <= 5; i++) {
			list.add("element " + i);
		}
		
		//Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
		System.out.println("Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive");
		
		for(String str: list.subList(0, 0)) {
			System.out.println(str);
		}
		
		for(String str: list.subList(0, 1)) {
			System.out.println(str);
		}
	}
	
	private static void bulkOperationsDemo() {
		
		List<String> list = new ArrayList<>();
		
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		list.add("element 5");
		
		System.out.println("addAll() - Appends all of the elements of the specified collection to the end of the list.");
		List<String> union = new ArrayList<>();
		union.addAll(list);
		
		System.out.println("The result after using the addAll() method: " + union);
		System.out.println();
		
		System.out.println("retainAll() - Retains only the elements in this list that are contained in the specified collection.");
		List<String> intersection = new ArrayList<>();
		
		for(int i = 1; i <= 3; i++) {
			intersection.add("element " + i);
		}
		
		intersection.add("element 6");
		
		System.out.println("The result after using the retainAll() method: " + intersection.retainAll(list));
		System.out.println(intersection);
		System.out.println();
		
		System.out.println("removeAll() - Removes from this list all of the elements that are contained in the specified collection.");
		List<String> difference = new ArrayList<>();
		
		for(int i = 1; i <= 3; i++) {
			difference.add("element " + i);
		}
		
		System.out.println("The result after using the removeAll() method: " + difference.removeAll(list));
		
		System.out.println(difference);
		System.out.println();
		
		System.out.println("containsAll() - Returns true if this list contains all of the elements in the specified collection.");
		List<String> checking = new ArrayList<>();
		
		for(int i = 1; i <= 6; i++) {
			checking.add("element " + i);
		}
		
		System.out.println("The result after using the containsAll() method: " + checking.containsAll(list));
		System.out.println();
	}
	
	public static void iterateOverDemo() {
		
		List<String> list = new ArrayList<>();
		
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		list.add("element 5");
		
		System.out.println("Using Iterator");
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		};
		
		System.out.println();
		System.out.println("Using advance for Loop");
		for(String str: list) {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("Using forEach()");
		
		list.forEach(str -> System.out.println(str));
	}
	
	public static void iteratorListDemo() {
		
		List<String> list = new ArrayList<>();
		
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		list.add("element 5");
		
		System.out.println();
		System.out.println("Traverse this list in either direction using ListIterator interface.");
		
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println("forward direction: " + iterator.next());
		}
		
		System.out.println();
		
		while(iterator.hasPrevious()) {
			System.out.println("backward direction: " + iterator.previous());
		}
		
		System.out.println();
		
		for(ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious();) {
			
			System.out.println(it.previous());
		}
	}
	
	public static void createAnArrayListFromCollectionDemo() {
		
		List<String> list = new ArrayList<>();
		
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		list.add("element 5");
		
		System.out.println();
		System.out.println("Create an ArrayList from another Collection");
		
		List<String> anotherList = new ArrayList<>();
		
		anotherList.add("element 6");
		anotherList.add("element 7");
		anotherList.add("element 8");
		anotherList.add("element 9");
		anotherList.add("element 10");
		
		System.out.println("Adding an entire collection to an ArrayList");
		list.addAll(anotherList);
		System.out.println(list);
	}
	
}
