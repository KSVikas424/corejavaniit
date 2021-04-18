package samplePrograms;

import java.util.Scanner;

/**
 * Main class
 */
public class PrimeSumInRange {
    /**
    * Main method
    * @param args 
    */
    static boolean isPrime(int i){
        for(int j =2;j <=i/2 ; j++)
            if(i%j == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
	
	// Student Code begins
	Scanner scan = new Scanner(System.in);
	int snum = scan.nextInt();
	int lnum = scan.nextInt();
	if ((snum < lnum) && (snum>=3 && lnum<=1000)){
	    int sum = 0;
	    for(int i = snum ; i <=lnum ; i++){
	        if(isPrime(i))
	            sum += i;
	    }
	    System.out.println(sum);
	    
	}else System.out.println("INVALID_INPUT");
		// Student Code ends
	
	
	
    }
}
