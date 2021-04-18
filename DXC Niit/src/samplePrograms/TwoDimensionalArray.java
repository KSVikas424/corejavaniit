package samplePrograms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class TwoDimensionalArray {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner scan = new Scanner(System.in);
		String [][]bookDetails = new String[5][3];
		int bookID[] = new int[5];
		for(int i = 0 ; i < 5; i++){
		    for(int j =0; j < 3 ;j++){
		        bookDetails[i][j]=scan.nextLine();
		        if(j == 0) {
		        	bookID[i]= Integer.parseInt(bookDetails[i][j]);
		    	}
		    }
		}
		Arrays.sort(bookID);
		/*for(int a : bookID)
		System.out.println(a);*/
		for(int i = 0 ; i < 5; i++){
			for(int j = 0; j < 5 ; j++) {
		    if(bookID[i] == Integer.parseInt(bookDetails[j][0])){
		    	for(int k = 0;k < 3 ;k++) {
		    		System.out.println(bookDetails[j][k]);
		    	}
		    }
		}
		}
	}
}