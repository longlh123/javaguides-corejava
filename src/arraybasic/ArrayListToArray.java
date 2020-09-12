package arraybasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
		String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" };
		
		ArrayList<String> source = new ArrayList<>();
		
		Collections.addAll(source, strArr);
		
		System.out.println("Convert ArrayList to Array using Object.toArray()");
		
		String[] arr1 = source.toArray(new String[source.size()]);
		
		System.out.println("Result: " + Arrays.toString(arr1));
		
		System.out.println("Manually convert ArrayList to Array");
		
		String[] arr2 = new String[source.size()];
		
		for(int i = 0; i < source.size(); i++) {
			arr2[i] = source.get(i);
		}
		
		System.out.println("Result: " + Arrays.toString(arr2));
	}
}
