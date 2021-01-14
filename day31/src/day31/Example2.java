package day31;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Example2 {
	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDate();
		System.out.println(year+"년"+month+"월"+day+"일");
		
		LocalDate date2 = LocalDate.now();
		LocalDateTime time = LocalDateTime.now();
		System.out.println(date2+" "+time);
		LocalDate date3 = LocalDate.of(2021, 01, 12);
		
		int y2 = date2.getYear();
		int m2 = date2.getMonthValue();
		int d2 = date2.getDayOfMonth();
		System.out.println(y2+"년"+m2+"월"+d2+"일");
	}
}
