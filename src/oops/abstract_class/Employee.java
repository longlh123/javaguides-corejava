package oops.abstract_class;

public abstract class Employee {
	
	private String name;
	private int paymentPerHour;
	
	public String getName() {
		return this.name;
	}
	
	public int getParmentPerHour() {
		return this.paymentPerHour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPaymentPerHour(int paymentperhour) {
		this.paymentPerHour = paymentperhour;
	}
	
	public Employee(String name, int paymentperhour) {
		super();
		this.name = name;
		this.paymentPerHour = paymentperhour;
	}
	
	abstract int calculateSalary();
}


