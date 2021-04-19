package samplePrograms;

import java.util.Comparator;
import java.util.TreeSet;

public class SortStringInReverse {

	public static void main(String[] args) {
		
		Comparator c = (obj1, obj2) -> {
			return -((String)obj2).compareTo((String)obj1); // Ascending order
			//return 0; // takes only first object and assumes remaining objects as duplicates
			//return 1; // insertion order
			//return -1; // reverse of insertion order
			//return ((String) obj2).compareTo((String) obj1);// Descending order
			//return -((String)obj1).compareTo((String)obj2); // Ascending order
		};
		TreeSet<String> ts = new TreeSet<String>(c);
		ts.add("hello");
		ts.add("Vikas");
		ts.add("java");
		ts.add("aaav");
		ts.add("aava");
		ts.add("vaaa");
		ts.add("hello");
		ts.add("Vikass");
		System.out.println(ts);
	}

}
