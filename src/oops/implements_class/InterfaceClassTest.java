package oops.implements_class;

public class InterfaceClassTest {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car("BMW");
		
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		System.out.println(Vehicle.getHorsePower(2500, 480));
		
		Vehicle motorbike = new MotorBike("ACTIVA 4G");
		
		System.out.println(motorbike.getBrand());
		System.out.println(motorbike.speedUp());
		System.out.println(motorbike.slowDown());
		System.out.println(motorbike.turnAlarmOn());
		System.out.println(motorbike.turnAlarmOff());
		System.out.println(Vehicle.getHorsePower(2500, 480));
		
	}
}
