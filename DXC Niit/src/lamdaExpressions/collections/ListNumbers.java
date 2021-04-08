package lamdaExpressions.collections;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(39);
		al.add(23);
		al.add(63);
		al.add(1);
		System.out.println(al);
		
		Comparator<Integer> c =(o1, o2) -> (o1<o2)? -1:(o1>o2)? 1:0;
		Collections.sort(al,c);
		System.out.println(al);
	}

}
