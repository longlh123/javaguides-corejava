package arraybasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		System.out.println("Convert Array to ArrayList using Arrays.asList()");
		
		String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" };
		
		List<String> lst1 = Arrays.asList(strArr);
		
		System.out.println("Original source form Arrays.List(): ");
		
		lst1.forEach(str -> System.out.print(str));
		
		Integer[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		List<Integer> lst2 = Arrays.asList(intArr);
		
		System.out.println();
		System.out.println("Original source form Arrays.List(): ");
		
		lst2.forEach(i -> System.out.print(i));
		
		System.out.println();
		System.out.println("Convert Array to ArrayList using Collections.addAll() method");
		
		ArrayList<String> lst3 = new ArrayList<String>();
		
		Collections.addAll(lst3, strArr);
		
		System.out.println();
		System.out.println("Original source form Arrays.List(): ");
		
		lst3.forEach(i -> System.out.print(i));
		
		System.out.println();
		System.out.println("Manually convert array to ArrayList");
		
		ArrayList<String> lst4 = new ArrayList<String>();
		
		for(int i = 0; i < strArr.length; i++) {
			lst4.add(strArr[i]);
		}
		
		System.out.println();
		System.out.println("Original source form Arrays.List(): ");
		
		lst4.forEach(str -> System.out.print(str));
	}
}
