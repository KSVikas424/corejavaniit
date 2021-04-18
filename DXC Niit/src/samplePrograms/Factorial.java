package samplePrograms;

public class Factorial {
	public static void main(String[] args) {
		//input =5; output =120
		int input =5,result =1;
		for(int i=input;i>=1;i--) {
			result = result * i;
		}
		System.out.println("Factorial of " + input+ " is: "+ result);
	}
}
/* 
when input = 5 

in for loop 
i = 5 
then result is 
result = 1* 5 

i =4 
result = 5*4 // 20 */

