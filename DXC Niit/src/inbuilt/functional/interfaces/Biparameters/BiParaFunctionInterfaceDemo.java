package inbuilt.functional.interfaces.Biparameters;

import java.util.function.BiFunction;

public class BiParaFunctionInterfaceDemo {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, String> bif = (a,b) -> {
			if(((a+b)%2) == 0) {
				return "even";
			}
			return "odd";
		};
		
		System.out.println(bif.apply(23, 53));
	}

}
