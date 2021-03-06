package lamdaExpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployees {
	
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("abdul",1234));
		employees.add(new Employee("ansari",2345));
		employees.add(new Employee("nitigna",7890));
		employees.add(new Employee("lahari",5678));
		employees.add(new Employee("rakesh",4567));
		
		System.out.println(employees);
		//sort the employees based on their eid in ascending order

		Comparator<Employee> c = (e1, e2) -> (e1.eid < e2.eid)? -1: (e1.eid>e2.eid)? 1:0 ;
		Collections.sort(employees,c);
		System.out.println("EID order: "+employees);
		
		Comparator<Employee> n = (e1, e2) -> e1.ename.compareTo(e2.ename);
		Collections.sort(employees,n);
		System.out.println("EName order: "+employees);
		
	}

}