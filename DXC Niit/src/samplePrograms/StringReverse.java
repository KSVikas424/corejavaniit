package samplePrograms;

public class StringReverse {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String name = scan.next();
		String nameRev ="";
		for(int i = name.length()-1 ;i>=0 ;i--) {
			nameRev += name.charAt(i);
		}
		System.out.println(name);
		System.out.println(nameRev);
		if(name.equals(nameRev))
			System.out.println("palindrome");
		else
			System.out.println("not Palindrome");
	}

}
