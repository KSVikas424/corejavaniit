package samplePrograms;

import java.util.Set;
import java.util.TreeSet;

public class RemoveRepeatedChars {
	public static void main(String[] args) {
		String input="Srinivas";
		Set<Character> s = new TreeSet<Character>();
		/*for(int i = 0 ;i<=input.length();i++) {
			for(int j = 0;j<=input.length();j++) {
				if(i!=j && (input.charAt(i) == input.charAt(j))){
					
				}
			}
		}*/
		for(int i = 0 ;i<input.length();i++) {
			s.add(input.charAt(i));
		}
		for(char a : s)
			System.out.print(a);
	}
}
