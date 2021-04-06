package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo {
	public static void main(String args[]) {
		LocalDate localDate = LocalDate.now();
		int day = localDate.getDayOfMonth();
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		LocalTime localTime = LocalTime.now();
		add();
		System.out.println(localDateTime);
		System.out.println(localTime.of(10, 34, 33));
	
	}

	private static void add() {
		// TODO Auto-generated method stub
		
	}

}
