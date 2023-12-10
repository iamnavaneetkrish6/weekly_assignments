package date;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateTimeDemos {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();

		System.out.println(date1);

		System.out.println("Date Time informations");

		System.out.println(date1.getDayOfWeek());
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getDayOfYear());
		System.out.println(date1.getMonth());
		
		System.out.println(date1.plusMonths(1));
		System.out.println(date1.minusYears(2));

		System.out.println(date1.isLeapYear());

		LocalDate date2 = LocalDate.of(1947, 8, 15);

		System.out.println(date2);
		
		
		System.out.println(date2.isBefore(date1));
		

		LocalDate date3 = LocalDate.parse("2023-01-01");

		System.out.println(date3);

		DateTimeFormatter givenFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

		String formattedDate = date3.format(givenFormat);

		System.out.println(formattedDate);

		DateTimeFormatter userFormat = DateTimeFormatter.ofPattern("yyyy =  MM = dd");

		String userFormatDate = date3.format(userFormat);

		System.out.println(userFormatDate);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

	}

}
