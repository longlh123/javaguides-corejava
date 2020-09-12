package oops.abstract_class;

public class Contractor extends Employee {
	
	private int workingHours;
	
	public int getWorkingHours() {
		return this.workingHours;
	}
	
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
	public Contractor(String name, int paymentperhours, int workinghours) {
		super(name, paymentperhours);
		this.workingHours = workinghours;
	}
	
	@Override
	public int calculateSalary() {
		return this.getParmentPerHour() * this.workingHours;
	}
}
