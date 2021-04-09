package inbuilt.functional.interfaces.primitives;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class TestIntPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p1 = i-> i% 2 ==0;
		IntPredicate p = i -> i %2 ==0;
		
		 System.out.println(p.test(4));     // Both are same
		 System.out.println(p1.test(4));
	}

}
