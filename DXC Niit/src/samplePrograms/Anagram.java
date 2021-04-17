package samplePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		String name = "listen";
		String name2 = "silent";
		char[] nameArr1 = name.toCharArray();
		char[] nameArr2 = name2.toCharArray();
		
		int count = 0;
		for(char a : nameArr1) {
			for(char b : nameArr2) {
				if(a == b) {
					count = 1;
				}
			}
			if(count == 1) {
				break;
			}
		}
		if(count == 1)
			System.out.println("Not Anagram");
		else 
			System.out.println("Anagram");
		
		
		/*int []arr = new int[nameArr1.length];
		int k =0;
		for(int i = 0; i<nameArr1.length;i++) {
			for(int j = 0 ; j<nameArr1.length;j++) {
				if(nameArr1[i] == nameArr2[j]) {
					arr[k] = 1;
					k++;
				}else {
					arr[k] = 0;
					k++;
				}
			}
		}
		int temp=0;
		for(int i : arr) 
		{
			if(i == 0) {
				temp = 0;
			}else temp =1;
		}
		if(temp == 0 )
			System.out.println("Anagram");
		else System.out.println("Not Anagram");
		*/
		
		/*Arrays.sort(nameArr1);
		Arrays.sort(nameArr2);
		String com = nameArr1.toString();
		String com2 = nameArr2.toString();
		if(com.equals(com2))
			System.out.println("Not Anagram");
		else 
			System.out.println("Anagram");*/
		
		
		
		
		
	}
}