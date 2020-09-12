package collections_interfaces;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		//Adding an new element to the end of the LinkedList using add() method
		LinkedList<String> list = new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		//Adding an new element at the specified position in the LinkedList using method - add(index, element)
		list.add(2, "D");
		
		//Adding an new element at the beginning of the LinkedList using addFirst() method
		list.addFirst("E");
		
		//Adding an new element at the end of the LinkedList using addLast() method
		list.addLast("F");
		
		//Adding all of the elements from an existing collection to the end of the LinkedList using addAll()
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("G");
		list2.add("H");
		
		list.addAll(list2);
		
		//Removes the first element in the LinkedList. Throws NoSuchElementException if the LinkedList is empty
		list.removeFirst();
		
		//Removes the last element in the LinkedList. Throws NoSuchElementException if the LinkedList is empty
		list.removeLast();
		
		//Removes the first occurrence of specified element from the LinkedList
		list.remove("D");
		
		System.out.println(list);
		
	}
}
