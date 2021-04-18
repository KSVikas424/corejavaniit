package samplePrograms;

import java.util.Scanner;
import java.util.TreeSet;

public class StringArrSorting3 {
public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    String[] strArr = sentence.split(" ");
	    TreeSet<String> ts = new TreeSet<String>();
	    for(String s : strArr)
	    	ts.add(s);
	    System.out.println(ts);
	    String[] sortStrArr = (String[])ts.toList();
	    String[] sortStr = sort(sortStrArr);
	    for(String arr: sortStr) {
	    	 System.out.println(arr);
	    }
}
public static String[] sort(String[] list) {
	for(int i =0;i <list.length;i++) {
		for(int j=0 ;j<list.length;j++) {
			if(list[i].length() > list[j].length()) {
				String temp = list[j];
				list[j] = list[i];
				list[i] = temp;
			}
		}
	}
	return list;
}
}
