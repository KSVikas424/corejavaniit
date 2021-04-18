package samplePrograms;

import java.util.Arrays;

public class RemoveRepeatedNum {
	public static void main(String[] args) {
		int[] input = {3,4,6,4,6,3,6,8,3,4,6,4,8};
		Arrays.sort(input);
		for(int i=0;i<input.length-1;i++) {
			if(input[i] != input[i+1])
				System.out.print(input[i]+" ");
		}
		int last = input[12];
		System.out.println(last);
	}
}
