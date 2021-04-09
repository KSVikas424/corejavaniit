package inbuilt.functional.interfaces.Biparameters;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class BiParaStudent {
	
	static Students stud;

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Students> bif = (marks, age) -> {
			return new Students(marks, age);
			
		};
		
		Supplier<String> supply = () -> {
			if(stud.m1> 60 && stud.age> 18)
				return "eligible";
			return "not eligible";
		};
	
		stud = bif.apply(70, 34);
		System.out.println(supply.get());
	}

}
