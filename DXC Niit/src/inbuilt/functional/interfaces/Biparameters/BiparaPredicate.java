package inbuilt.functional.interfaces.Biparameters;

import java.util.function.BiPredicate;

public class BiparaPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> bip = (a,b) -> (b+a)%2 ==0;
		
		System.out.println(bip.test(13,53));
	}

}
