package samplePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Source {
	public static void main(String args[] ) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner scan = new Scanner(System.in);
		String nameArr[] = new String[5];
		for(int i = 0 ; i <= 4 ; i++){
		    nameArr[i] = scan.next();
		}
		Arrays.sort(nameArr);
		for(String names : nameArr)
		    System.out.println(names);
	}
}