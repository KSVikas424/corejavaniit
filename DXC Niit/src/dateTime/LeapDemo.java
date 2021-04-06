package dateTime;

import java.time.Year;

public class LeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Year year = Year.of(2021);
		if(year.isLeap()) {
			System.out.println("Leap Year");
		}
	}

}
