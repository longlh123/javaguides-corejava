package arraybasic;

import java.util.Arrays;

public class ArrayCopies {
	public static void main(String[] args) {
		
		int[] source = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		System.out.println("Source array: " + Arrays.toString(source));
		
		System.out.println("Copy array using Built-in System.arraycopy() method");
		
		int[] temp = new int[5];
		
		System.arraycopy(source, 0, temp, 0, 5);
		
		System.out.println("Copy first five elements of array. Result array: " + Arrays.toString(temp));
		
		System.out.println("Copy array using Arrays.copyOf() method");
		
		int[] destArr = new int[5];
		
		destArr = Arrays.copyOf(source, destArr.length);
		
		System.out.println("Copy first five elements of array. Result array: " + Arrays.toString(destArr));
		
		System.out.println("Copy array using Object.clone() method");
		
		int[] destArr2 = source.clone();
		
		System.out.println("Copy all of elements of array. Result array:" + Arrays.toString(destArr2));
		
		System.out.println("Copy array using Arrays.copyOfRange() method");
		
		int[] destArr3 = Arrays.copyOfRange(source, 2, 5);
		
		System.out.println("Copy most of elements that are in the 2-5 range. Result array: " + Arrays.toString(destArr3));
	}
}
