package inbuilt.functional.interfaces.functions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {
	static ArrayList<JavaStudent> javaStudents ;

	public static void main(String[] args) {
		Predicate<JavaStudent> p = s -> s.marks >= 60;

		Consumer<JavaStudent> c = s -> System.out.println(s.name);


		System.out.println("Student who have got 60 or more marks");
		for(JavaStudent student: javaStudents) {
			if(p.test(student)) {
				c.accept(student);
			}
		}
	}
	public static void populateStudents() {
		javaStudents.add(new JavaStudent(80,"Vikas"));
		javaStudents.add(new JavaStudent(80,"Srinivas"));
		javaStudents.add(new JavaStudent(80,"Kalidindi"));
		javaStudents.add(new JavaStudent(80,"Abdul"));
		javaStudents.add(new JavaStudent(80,"Tanveer"));
	}

}