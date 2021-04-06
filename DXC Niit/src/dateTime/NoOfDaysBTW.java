package dateTime;

import java.time.LocalDate;
import java.time.Period;

public class NoOfDaysBTW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate dob = LocalDate.of(2000, 02, 18);
		Period period = Period.between(dob, LocalDate.now());
		System.out.println(period.getYears()+ " " +period.getMonths() + " " +period.getDays());
	}

}
