package samplePrograms;

import java.util.Scanner;

public class SumArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.nextLine());
		if(n>0) {
			int temp =0;
			int []arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(scn.nextLine());
				if(arr[i] < 0 ) {
					temp =1;
				}
			}
			if(temp == 1) {
				System.out.println("Invalid input");
				return;
			}
			System.out.println(maximumSum(arr, n));
		}
		else System.out.println("Invalid array size");
	}
	
	public static int maximumSum(int[] arr, int n) {
		int evenSum=0 , oddSum=0;
		for(int a : arr) {
			if(a%2 == 0) {
				evenSum = evenSum + a;
			}else {
				oddSum = oddSum + a;
			}
		}
		return evenSum >= oddSum ? evenSum : oddSum;
	}
}
