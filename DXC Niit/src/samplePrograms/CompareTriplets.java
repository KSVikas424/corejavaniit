package samplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompareTriplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		ArrayList<Integer> alice = (ArrayList<Integer>)a;
		ArrayList<Integer> bob = (ArrayList<Integer>)b;
		int aScore=0, bScore=0 ;
		for(int i = 0;i<alice.size();i++){
			if(alice.get(i) > bob.get(i)) {
				aScore++;
			}else if (alice.get(i) < bob.get(i)) {
				bScore++;
			}
		} 
		return (List<Integer>)Arrays.asList(aScore, bScore);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {
			a.add(scan.nextInt());
		}

		List<Integer> b = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {
			b.add(scan.nextInt());
		}

		List<Integer> result = compareTriplets(a, b);

		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));

			if (i != result.size() - 1) {
				System.out.print(" ");
			}
		}
	}
}
