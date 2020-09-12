package oops.abstract_class;

public class FulltimeEmployee extends Employee {

	private int workingHours;
	
	public int getWorkingHours() {
		return this.workingHours;
	}
	
	public void setWorkingHours(int workinghours) {
		this.workingHours = workinghours;
	}
	
	public FulltimeEmployee(String name, int paymentperhours, int workinghours) {
		super(name, paymentperhours);
		this.workingHours = workinghours;
	}
	
	@Override
	public int calculateSalary() {
		return this.getParmentPerHour() * this.workingHours;
	}
}
