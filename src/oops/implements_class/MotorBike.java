package oops.implements_class;

public class MotorBike implements Vehicle, Alarm {
	
	private final String brand;
	
	public MotorBike(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String turnAlarmOn() {
	    return Alarm.super.turnAlarmOn();
	}
	 
	@Override
	public String turnAlarmOff() {
	    return Alarm.super.turnAlarmOff();
	}
	
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "The motorbike is speeding up.";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "The motorbike is speeding down.";
	}
}
