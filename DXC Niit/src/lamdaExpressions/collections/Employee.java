package lamdaExpressions.collections;

public class Employee {
	String ename;
	int eid;
	public Employee(String ename, int eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}
	
	public String toString() {
		return eid +"-"+ename;
		//super.toString();
	}
}
