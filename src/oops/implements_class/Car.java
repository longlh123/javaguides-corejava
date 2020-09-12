package oops.implements_class;

public class Car implements Vehicle, Alarm {
	
	private final String brand;
	
	public Car(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String turnAlarmOn() {
	    return Vehicle.super.turnAlarmOn();
	}
	 
	@Override
	public String turnAlarmOff() {
	    return Vehicle.super.turnAlarmOff();
	}
	
	@Override
	public String getBrand() {
		return brand;
	}
	
	@Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}
