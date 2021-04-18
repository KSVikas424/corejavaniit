package samplePrograms;

import java.util.Arrays;

public class NotRepeatedChar {
	public static void main(String[] args) {
		String input = "vviikkas";
		char[] toArr = input.toCharArray();
		
		for(int i=0; i<toArr.length-1 ;i++) {
			int rep = 0;
			for(int j = 0 ; j < toArr.length;j++) {
				if(i != j && toArr[i] == toArr[j]) {
				rep =1;	
			}
			}
			if(rep == 0) {
				System.out.println("First not repeated char is "+ toArr[i]);
				break;
		}
			}
	}
}
