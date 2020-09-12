package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Student implements Cloneable, Serializable {
	
	private String name;
	private String college;
	
	public Student() {
		super();
	}
	
	public Student(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCollege() {
		return this.college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	public static void main(String[] args) {
		
		//Using a new keyword
		Student s1 = new Student("Ramesh", "BVB");
        Student s2 = new Student("Prakash", "GEC");
        Student s3 = new Student("Pramod", "IIT");
        
        //Using a newInstance() method of Class class
        try {
        	String classname = "oops.Student";
        	Class clazz = Class.forName(classname);
        	Student s = (Student)clazz.newInstance();
        	System.out.println(s.getName());
        	System.out.println(s.getCollege());
        }catch(InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        	e.printStackTrace();
        }
        
        //Using a newInstance() of Constructor class
        Constructor<Student> constructor;
        
        try {
        	constructor = Student.class.getConstructor();
        	Student s = constructor.newInstance();
        	System.out.println(s.getName());
        	System.out.println(s.getCollege());
        }catch(InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
        	e.printStackTrace();
        }
        
        //Using Object Cloning - clone() method
        //--The clone() method is used to create a copy of an existing object in order to the clone() method the corresponding class
        //should have implemented a Cloneable interface 
        try {
        	Student sc = (Student)s1.clone();
        	System.out.println(s1.getName());
        	System.out.println(s1.getCollege());
        	sc.setName(sc.getName() + "_New");
        	sc.setCollege(sc.getCollege() + "_New");
        	System.out.println(sc.getName());
        	System.out.println(sc.getCollege());
        }catch(CloneNotSupportedException e) {
        	e.printStackTrace();
        }
        
        //Using Object Deserialization
        //--We will be using Serialization interface in Java.
        //Path to store the Serialized Object
        String filePath = "sample.txt";
        
        try {
        	FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        	ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        	outputStream.writeObject(s2);
        	outputStream.flush();
        	outputStream.close();
        	
        	FileInputStream fileInputStream = new FileInputStream(filePath);
        	ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        	
        	Student sc = (Student)inputStream.readObject();
        	
        	inputStream.close();
        	
        	System.out.println(sc.getName());
        	System.out.println(sc.getCollege());
        } catch(Exception e) {
        	e.printStackTrace();
        }
        
	}
}
