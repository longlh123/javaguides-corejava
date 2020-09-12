package collections_interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		
		//List allows you to add duplicate elements
		List<String> list = new ArrayList<>();
		
		for(int i = 1; i <= 2; i++) {
			list.add("element " + i);
			list.add("element " + i);
		}
		
		System.out.println(list);
		
		//List allows you to have 'null' elements
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		
		//access elements from list
		System.out.println(list.get(2));
		System.out.println(list.get(4));
	}
}
