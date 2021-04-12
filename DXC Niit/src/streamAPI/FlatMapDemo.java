package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Srinivas, Vikas, Kalidindi");
		names.add("Abdul, Tanveer, Yashas");
		names.add("Naveen, AB, Hello");
		Function<String, Stream<String>> f = (name) -> {
			String[] namesArray = name.split(",");
			return (Stream<String>) Arrays.asList(namesArray).stream();
		};
		Consumer<String> c = name ->
			System.out.println(name);;
		names.stream().flatMap(f).forEach(c);
	}

}
