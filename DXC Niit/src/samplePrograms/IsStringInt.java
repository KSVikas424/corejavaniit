package samplePrograms;

public class IsStringInt {

	public static void main(String[] args) {
		
		String input ="12345";
		boolean ans = false;
		for(int i =0;i<input.length();i++) {
			if(input.charAt(i)>='0' && input.charAt(i)<='9') 
			{
				ans = true;
			}else {
				ans = false;
				System.out.println("it is not number");
			    break;
			}				
		}
		if(ans) {
			System.out.println("it is number");
		}
		
	}

}
