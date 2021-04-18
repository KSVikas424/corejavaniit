package samplePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringArrSorting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		List<String> list = function(sentence)
;		for(int i=list.size()-1;i>=0;i--)
			System.out.println(list.get(i));
	}

	static List<String> function(String sentence){
		String[] strArr = sentence.split(" ");
		String[] sortStrArr = sort(strArr);
		
		List<String> list =new ArrayList<String>();
		for(String s : strArr)
			list.add(s);
		return list;
	}
	public static String[] sort(String[] list) {
		for(int i =0;i <list.length;i++) {
			for(int j=0 ;j<list.length;j++) {
				if(list[i].length() > list[j].length()) {
					String temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
				if(list[i].length() == list[j].length()) {
					int a = list[i].compareTo(list[j]);
					if(a > 0) {
						String temp = list[i];
						list[i] = list[j];
				list[j] = temp;
					}
				}
			}
		}
		return list;
	}
}
