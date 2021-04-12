package streamAPI;

public class Employee {

	String name;
	int sal;
	public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	public String toString() {
		return this.name + "\t" + this.sal;
	}
	
}
