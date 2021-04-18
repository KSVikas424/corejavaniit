package samplePrograms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class
 */
public class NumToBinary {
    /**
    * Main method
    * @param args 
    */
    public static void main(String[] args) {
	
		// Student Code Begin
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num>=1 && num <= 999){
			String s = new String();
		    while(num>0){
		        int lcm = num%2;
		        s += lcm;
		        num = num/2;
		    }
		    StringBuffer sb = new StringBuffer(s).reverse();
		    System.out.println(sb);
		}
		
	
		// Student Code end
		
		scan.close();
		
    }
}
