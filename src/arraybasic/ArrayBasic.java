package arraybasic;

public class ArrayBasic {
	public static void main(String[] args) {
		
		//initialize primitive one dimensional array
		int[] anArray = new int[5];
		
		anArray[0] = 10;
		anArray[1] = 20;
		anArray[2] = 30;
		anArray[3] = 40;
		anArray[4] = 50;
		
		//Each array elements are accessed by its numerical index
		System.out.println("Element 1 at index 0: " + anArray[0]);
		System.out.println("Element 2 at index 1: " + anArray[1]);
		System.out.println("Element 3 at index 2: " + anArray[2]);
		System.out.println("Element 4 at index 3: " + anArray[3]);
		System.out.println("Element 5 at index 4: " + anArray[4]);
		
		//initialize Object one dimensional array
		Object[] anArrayOfString = new String[5];
		
		anArrayOfString[0] = "abc";
		anArrayOfString[1] = "xyz";
		anArrayOfString[2] = "id";
		anArrayOfString[3] = "name";
		anArrayOfString[4] = "address";
		
		//Each array elements are accessed by its numerical index
		System.out.println("Element 1 at index 0: " + anArrayOfString[0]);
		System.out.println("Element 2 at index 1: " + anArrayOfString[1]);
		System.out.println("Element 3 at index 2: " + anArrayOfString[2]);
		System.out.println("Element 4 at index 3: " + anArrayOfString[3]);
		System.out.println("Element 5 at index 4: " + anArrayOfString[4]);
		
		Employee[] anArrayOfEmployees = new Employee[2];
		anArrayOfEmployees[0] = new Employee(10, "LongPham");
		anArrayOfEmployees[1] = new Employee(11, "NgocNguyen");
		
		//Each array elements are accessed by its numerical index
		System.out.println("Element 1 at index 0: " + anArrayOfEmployees[0].getName());
		System.out.println("Element 2 at index 1: " + anArrayOfEmployees[1].getName());
		
		//Shortcut syntax to create and initialize an array
		int[] array = {100, 200, 300, 400, 500, 600, 700, 800, 900};
		
		//Each array elements are accessed by numerical index
		System.out.println("Element 1 at index 0: " + array[0]);
		System.out.println("Element 2 at index 1: " + array[1]);
		System.out.println("Element 3 at index 2: " + array[2]);
		System.out.println("Element 4 at index 3: " + array[3]);
		System.out.println("Element 5 at index 4: " + array[4]);
		
		//Shortcut syntax to create and initialize an array
		String[] arrayOfStrings = { "abc", "xyz", "id", "name", "address" };
		
		//Each array elements are accessed by numerical index
		System.out.println("Element 1 at index 0: " + arrayOfStrings[0]);
		System.out.println("Element 2 at index 1: " + arrayOfStrings[1]);
		System.out.println("Element 3 at index 2: " + arrayOfStrings[2]);
		System.out.println("Element 4 at index 3: " + arrayOfStrings[3]);
		System.out.println("Element 5 at index 4: " + arrayOfStrings[4]);
		
		//Shortcut syntax to create and initialize an array
		Employee[] employees = { new Employee(10, "LongPham"), new Employee(11, "NgocNguyen") };
		
		//Each array elements are accessed by numerical index
		System.out.println("Element 1 at index 0: " + employees[0].getName());
		System.out.println("Element 2 at index 1: " + employees[1].getName());
	}
}

class Employee{
	private int id;
	private String name;
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}