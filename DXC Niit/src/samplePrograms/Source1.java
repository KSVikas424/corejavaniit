package samplePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Source1 {
	public List<Integer> getSumOfListElements(List<Integer> first,List<Integer> second){
		List<Integer> al = new ArrayList<Integer>();
		if(first.size() > second.size()) {
			for(int i =0;i<second.size();i++) {
				al.add(first.get(i)+second.get(i));
			}
			for(int i=second.size();i<first.size();i++) {
				al.add(first.get(i));
			}
		}
		else {
			for(int i =0;i<first.size();i++) {
				al.add(first.get(i)+second.get(i));
			}
			for(int i=second.size();i<second.size();i++) {
				al.add(second.get(i));
			}
		}
		return al;
	}

	public static void main(String[] args) {
		//CODE HERE
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		String[] s11 = s1.split(" ");
		String[] s22 = s2.split(" ");
		List<Integer> first = new ArrayList<Integer>();
		List<Integer> second = new ArrayList<Integer>();
		for(int i=0;i<s11.length;i++){
			first.add(Integer.parseInt(s11[i]));
		}
		for(int i=0;i<s22.length;i++){
			second.add(Integer.parseInt(s22[i]));
		}
		Source1 source = new Source1();
		List<Integer> al = source.getSumOfListElements(first, second);
		System.out.println(al);
	}
}
