package oops.abstract_class;

public class AbstractClassTest {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.sound();
		dog.sound();
		
		Employee contractor = new Contractor("Long", 10, 10);
		Employee fulltimeEmployee = new FulltimeEmployee("Ngoc", 15, 15);
		
		System.out.println("Salary of " + contractor.getName() + ": " + contractor.calculateSalary());
		System.out.println("Salary of " + fulltimeEmployee.getName() + ": " + fulltimeEmployee.calculateSalary());
		
	}
}
