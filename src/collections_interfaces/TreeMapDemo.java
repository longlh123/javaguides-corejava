package collections_interfaces;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		//Creating a TreeMap
		SortedMap<String, String> fileExtensions = new TreeMap<>();
		
		//Add new key-value pairs to a TreeMap
		fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");
        
        //Printing the TreeMap (Output will be sorted based on keys
        System.out.println(fileExtensions);
        
        System.out.println("The first key is " + fileExtensions.firstKey());
        
        System.out.println("The last key is " + fileExtensions.lastKey());
        
        SortedMap<String, String> sortedMap = fileExtensions.tailMap("java");
        
        System.out.println(sortedMap);
        
        sortedMap = fileExtensions.headMap("java");
        
        System.out.println(sortedMap);
	}
}
