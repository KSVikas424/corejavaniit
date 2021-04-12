package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayMap {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(23);
	list.add(22);
	list.add(27);
	list.add(29);
	list.add(32);
	list.add(43);
	list.add(27);
	list.add(3);
	list.add(53);
	list.add(23);
	List<Integer> l = list.stream().map(i -> i +6).collect(Collectors.toList());
	ArrayList<Integer> list2 = (ArrayList<Integer>) l;
	System.out.println(list2);
	
	List<Integer> list3 = list2.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
	ArrayList<Integer> list4 = (ArrayList<Integer>) list3;
	System.out.println(list4);
	
	
	/*List<Integer> list5 = list2.stream().count().collect(Collectors.toList());
	ArrayList<Integer> list6 = (ArrayList<Integer>) list5;
	System.out.println(list6);*/
}
}
