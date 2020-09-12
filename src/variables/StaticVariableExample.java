package variables;

public class StaticVariableExample {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Student 1");
		Student s2 = new Student(101, "Student 2");
		Student s3 = new Student(101, "Student 3");
		Student s4 = new Student(101, "Student 4");
		Student s5 = new Student(101, "Student 5");
		
		System.out.println("-------------Students--------------");
		System.out.println(s1.ToString());
		System.out.println(s2.ToString());
		System.out.println(s3.ToString());
		System.out.println(s4.ToString());
		System.out.println(s5.ToString());
	}
}

class Student{
	private int id;
	private String name;
	private static String college="ABC"; //static variable
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String ToString() {
		return "Student [id: " + id + ", name: " + name + ", college: " + college + "]";
	}
}
