package oops.implements_class;

public interface Alarm {
	
	default String turnAlarmOn() {
		return "Turning the vehicle alarm on.";
	}
	
	default String turnAlarmOff() {
		return "Turning the vehicle alarm off.";
	}
}
