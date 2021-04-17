package samplePrograms;

import java.util.Set;
import java.util.TreeSet;

public class NumTwiceInArr {

	public static void main(String[] args) {
		int arr[] = {1,1,2,3,4,5,6,5,6};
		Set<Integer> repele = new TreeSet<Integer>();
		for(int i= 0; i<arr.length;i++) {
			for(int j = 0; j <arr.length;j++) {
				if ( i != j && arr[i] == arr[j] ) {
					repele.add(arr[i]);
				}
			}
		}
		for(int a : repele)
			System.out.println(a + " Repeated twice in an array");
	}

}
