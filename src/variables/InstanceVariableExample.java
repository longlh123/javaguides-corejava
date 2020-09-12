package variables;

public class InstanceVariableExample {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		//Before assigning values to employee object
		System.out.println(employee.id);
		System.out.println(employee.empName);
		System.out.println(employee.age);
		
		employee.empName = "LongPham";
		employee.id = 100;
		employee.age = 34;
		
		//After assigning values to employee object
		System.out.println(employee.id);
		System.out.println(employee.empName);
		System.out.println(employee.age);
	}
}

class Employee{
	//instance variable employee id
	public int id;
	//instance variable employee name
	public String empName;
	//instance variable employee age
	public int age;
}