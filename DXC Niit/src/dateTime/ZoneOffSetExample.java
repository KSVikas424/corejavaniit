package dateTime;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

public class ZoneOffSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZoneOffset zone = ZoneOffset.UTC;
		Temporal temp = zone.adjustInto(ZonedDateTime.now());
		System.out.println(temp);
	}

}
