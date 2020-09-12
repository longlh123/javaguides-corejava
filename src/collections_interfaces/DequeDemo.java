package collections_interfaces;

import java.util.ArrayDeque;
import java.util.Deque;

class Book{
	
	int id;
	String name, author, publisher;
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class DequeDemo {
	
	public static void main(String[] args) {
		
		//Creating a Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		
		for(int i = 1; i <= 5; i++) {
			deque.add("element " + i);
		}
		
		System.out.println(deque);
		
		//Iterating over a Deque using simple for-each loop
		System.out.println("Iterating over a Deque using simple for-each loop");
		
		for(String name: deque) {
			System.out.println(name);
		}
		
		Deque<String> deque2 = new ArrayDeque<String>();
		
		deque2.offer("element 1");
		deque2.offer("element 2");
		deque2.add("element 3");
		deque2.offerFirst("element 4");
		
		System.out.println("After using offerFirst()");
		for(String name: deque2) {
			System.out.println(name);
		}
		
		deque2.pollLast();
		
		System.out.println("After using pollLast()");
		for(String name: deque2) {
			System.out.println(name);
		}
		
		Deque<Book> books = new ArrayDeque<Book>();
		
		Book b1 = new Book(1, "Book 1", "Author 1", "Publisher 1", 100);
		Book b2 = new Book(2, "Book 2", "Author 2", "Publisher 2", 200);
		Book b3 = new Book(3, "Book 3", "Author 3", "Publisher 3", 300);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		for(Book b: books) {
			System.out.println(b.id + b.name);
		}
	}
	
	
}
