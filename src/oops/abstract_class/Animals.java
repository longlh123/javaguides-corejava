package oops.abstract_class;

abstract class Animals {
	
	//private String name;
	
	//All kinds of animals eat food so make this common to all animals
	public void eat() {
		System.out.println("Eating.......");
	}
	
	//The animals make different sounds. They will provide own implementation 
	abstract void sound();
}
