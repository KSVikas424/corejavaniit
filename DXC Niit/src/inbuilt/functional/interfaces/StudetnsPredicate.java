package inbuilt.functional.interfaces;

import java.util.function.Predicate;

public class StudetnsPredicate {
	

	public static void main(String[] args) {
		
		Predicate<Student> p = (s) ->(s.m1+s.m2+s.m3) > 75? true : false;
		
		Student s2 = new Student(10, 20, 30);
		
			if(p.test(s2))
				System.out.println("Passsed");
			else
				System.out.println("Failed :(");
		
		
	}
}
