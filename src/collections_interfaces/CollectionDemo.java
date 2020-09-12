package collections_interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		Collection<String> fruitCollection = new ArrayList<>();
		fruitCollection.add("banana");
		fruitCollection.add("orange");
		fruitCollection.add("apple");
		
		System.out.println(fruitCollection);
		
		fruitCollection.remove("orange");
		System.out.println(fruitCollection);
		
		System.out.println(fruitCollection.contains("orange"));
		
		fruitCollection.forEach((element) -> {
			System.out.println(element);
		});
		
		fruitCollection.clear();
		
		System.out.println(fruitCollection);
	}
}
