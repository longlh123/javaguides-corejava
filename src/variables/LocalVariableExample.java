package variables;

public class LocalVariableExample {
	public int sum(int n) {
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		LocalVariableExample localVariableExample = new LocalVariableExample();
		int sum = localVariableExample.sum(100);
		System.out.println("Sum of first 100 numbers is " + sum);
	}
}
