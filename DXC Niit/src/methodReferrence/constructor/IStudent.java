package methodReferrence.constructor;

public class IStudent {

	String name;
	int age;
	int marks;
	public IStudent(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		System.out.println("my name is " + this.name);
	}
	public IStudent() {
		System.out.println("Default constructor");
	}
	
}
