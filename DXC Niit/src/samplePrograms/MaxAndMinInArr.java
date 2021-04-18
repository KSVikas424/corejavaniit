package samplePrograms;

import java.util.Arrays;

public class MaxAndMinInArr {
	public static void main(String[] args) {
		int []input = {1,2,4,6,4,7,4,3,234,0};
		Arrays.sort(input);
		/*for(int a:input)
		System.out.println(a);*/
		int len=input[input.length-1];
		int min2 = input[0];
		System.out.println("Max is "+ len+" Min is "+min2);
		/*int min =input[0], max =input[0];
		for(int a : input) {
			if(a < min) {
				min =a;
			}if(a>max) {
				max =a;
			}
		}
		System.out.println("max is "+ max +", min is "+ min);*/
	}
}
