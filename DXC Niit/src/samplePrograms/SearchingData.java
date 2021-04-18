package samplePrograms;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class SearchingData {
  
  String customerDetails[][]=new String[5][3];
    SearchingData()
	{
	customerDetails[0][0]="1001";
	customerDetails[0][1]="Raj";
	customerDetails[0][2]="Chennai";
	
	customerDetails[1][0]="1008";
	customerDetails[1][1]="Akshay";
	customerDetails[1][0]="Pune";
	
	customerDetails[2][0]="1002";
	customerDetails[2][1]="Simrath";
	customerDetails[2][2]="Amristar";
	
	customerDetails[3][0]="1204";
	customerDetails[3][1]="Gaurav";
	customerDetails[3][2]="Delhi";
	
	customerDetails[4][0]="1005";
	customerDetails[4][1]="Ganesh";
	customerDetails[4][2]="Chennai";
	
	}
  
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		SearchingData obj = new SearchingData();
		int count =0;
		for(int i = 0;i < 5;i++){
			//System.out.println(obj.customerDetails[i][1] + " "+ name);
		    if(obj.customerDetails[i][1].equals(name)){
		        for(int j =0; j<3;j++)
		            System.out.println(obj.customerDetails[i][j]);
		        count = 1;
		        break;
		    }
		}
		if(count ==0)
		    System.out.println("No Record Found");
	}
}