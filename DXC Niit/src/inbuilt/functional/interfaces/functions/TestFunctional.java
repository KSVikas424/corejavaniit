package inbuilt.functional.interfaces.functions;

import java.util.function.Function;

public class TestFunctional {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i-> i*i;
		System.out.println(f.apply(4));
		
		Function<String, Integer> f1 = s -> s.length();
		System.out.println(f1.apply("bikas"));
	}

}
