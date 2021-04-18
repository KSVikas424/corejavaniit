package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctAndFlatMapDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello, my name is Vikas!!");
		al.add("Hello, my name is Srinivas. My sir is Abdul.");
		
		Function<String, Stream<String>> f = (str) -> {
			return (Stream<String>) Arrays.asList(str.split(" ")).stream();
		};
		
		ArrayList<String> al2 = (ArrayList<String>) al.stream().flatMap(f).distinct().collect(Collectors.toList());
		
		System.out.println(al2);
		
	}

}
