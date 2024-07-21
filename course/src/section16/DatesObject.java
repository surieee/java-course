package section16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesObject {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2010, 1, 21);

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
	}
}
