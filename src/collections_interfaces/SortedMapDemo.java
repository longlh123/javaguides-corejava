package collections_interfaces;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	
	public static void main(String[] args) {
		
		//Create a TreeMap
		SortedMap<String, String> fileExtensions = new TreeMap<>();
		
		//Adding new key-value pairs to a TreeMap
		fileExtensions.put("python", ".py");
		fileExtensions.put("c++", ".cpp");
		fileExtensions.put("kotlin", "kt");
		
	}
}
