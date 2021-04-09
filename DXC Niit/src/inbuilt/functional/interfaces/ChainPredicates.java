package inbuilt.functional.interfaces;

import java.util.function.Predicate;

public class ChainPredicates {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = i -> i%2 == 0;
		Predicate<Integer> p2 = i -> i >= 10;
		
		int arr[] = {10, 3 , 52, 25, 3,5,6,7,7,3,4,6,34,6,3,4,6,457,};
		System.out.println("if no > 10 and if it is even then print");
		
		for(int i : arr) {
			if(p1.and(p2).test(i))
				System.out.println(i);
		}
		
		System.out.println("if no > 10 or if it is an even no then print it");
		
		for(int i : arr)
			if(p1.or(p2).test(i))
				System.out.println(i);
	}

}
