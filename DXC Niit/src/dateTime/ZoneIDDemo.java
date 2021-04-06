package dateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ZoneId zone = ZoneId.systemDefault();
System.out.println(zone);

ZoneId officeZoneId = ZoneId.of("America/Los_Angeles");
ZonedDateTime zdt = ZonedDateTime.now(officeZoneId);
System.out.println("date and time in Los Angeles is " + zdt);
	}

}
