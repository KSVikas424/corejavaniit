package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Srinivas", 9876));
		empList.add(new Employee("Vikas", 9875));
		empList.add(new Employee("Kalidindi", 98769));
		empList.add(new Employee("Abdul", 9871));
		empList.add(new Employee("Tanveer", 9870));
		empList.add(new Employee("Yashas", 9872));
		empList.add(new Employee("Babji", 9873));
		empList.add(new Employee("Lahari", 9866));
		empList.add(new Employee("Gayathri", 9865));
		System.out.println(empList);
		
		Comparator<Employee> c = (e1,e2) -> {
			return (e1.sal <e2.sal)? -1:
				(e1.sal>e2.sal)? 1 : 0;
		};
		
		List<Employee> sortedList = empList.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList);
		
		
		Comparator<Employee> c1 = (e1,e2) -> {
			return (e1.sal >e2.sal)? -1:
				(e1.sal<e2.sal)? 1 : 0;
		};
		
		List<Employee> sortedList1 = empList.stream().sorted(c1).collect(Collectors.toList());
		System.out.println(sortedList1);
	}

}
