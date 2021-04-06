package dateTime;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.ofYearDay(1999, 26);
		System.out.println(ld);
	}

}
