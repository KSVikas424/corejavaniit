package streamAPI;

public class Employee implements Comparable<Employee>{

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

	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		 return (this.sal > e1.sal) ? 1 :(this.sal < e1.sal) ? -1 : 0;
	}
	
}
