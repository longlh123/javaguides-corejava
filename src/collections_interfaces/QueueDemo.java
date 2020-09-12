package collections_interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		//Create and initialize a Queue String using a LinkedList
		Queue<String> queue = new LinkedList<>();
		
		for(int i = 1; i <= 5; i++) {
			queue.add("element " + i);
		}
		
		System.out.println(queue);
		
		//Remove an element from the Queue using remove()
		//The remove() method throws NoSuchElementException if the Queue is null
		String name = queue.remove();
		
		System.out.println(name);
		System.out.println(queue);
		
		//Remove an element from the Queue using poll()
		//The poll() returns null if the Queue is null
		name = queue.poll();
		
		System.out.println(name);
		System.out.println(queue);
		
		//Check if a Queue is empty
		System.out.println("Is a Queue empty? - " + queue.isEmpty());
		
		//Find the size of a Queue
		System.out.println("The size of a Queue is " + queue.size());
		
		//Check if the Queue contains an elements
		if(queue.contains("element 1")) {
			System.out.println("The queue contains element 1.");
		} else {
			System.out.println("The queue doesn't contain element 1.");
		}
		
		//Get the element at the front of the Queue without removing it using element()
		//The element() method throws NoSuchElementException if the queue is null
		String first_name = queue.element();
		
		System.out.println(first_name);
		
		//Get the element at the front of the Queue without removing it using element()
		//The element() method returns null if the Queue is null
		first_name = queue.element();
		
		System.out.println(first_name);
		
		//Iterating over a Queue using forEach()
		System.out.println("Iterating over a Queue using forEach()");
		
		queue.forEach(element -> {
			System.out.println(element);
		});
		
		//Iterating over a Queue using iterator()
		System.out.println("Iterating over a Queue using iterator()");
		
		Iterator<String> eQueue = queue.iterator();
		
		while(eQueue.hasNext()) {
			System.out.println(eQueue.next());
		}
		
		//Iterating over a Queue using iterator() and forEachRemaining()
		System.out.println("Iterating over a Queue using iterator() and forEachRemaining()");
		
		eQueue = queue.iterator();
		
		eQueue.forEachRemaining(element -> {
			System.out.println(element);
		});
		
		//Iterating over a Queue using simple for-each loop
		System.out.println("Iterating over a Queue using simple for-each loop");
		
		for(String element: queue) {
			System.out.println(element);
		}
	}
}
