package samplePrograms;

import java.util.Scanner;

public class StringArrSorting4 {
	public static void main(String[] args) {
		
			    Scanner scan = new Scanner(System.in);
			    String sentence = scan.nextLine();
			    String[] strArr = sentence.split(" ");
			    String[] sortStrArr = sort(strArr);
			    for(int i=sortStrArr.length-1;i>=0;i--)
			    	System.out.println(sortStrArr[i]);
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
