package in.trump.date_api;

import java.time.LocalDate;
import java.time.Month;

public class DateDemo {
	
	static String Date = "2023-07-01";			

	public static void main(String[] args) {
		//get current date
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//mention specific date
		LocalDate of = LocalDate.of(2022, 9, 01);
		System.out.println(of);
		
		of = LocalDate.of(2023, Month.APRIL, 01);
		System.out.println(of);
		
		of = LocalDate.parse(Date);
		System.out.println(of);

		//adding 4 days to given date
		of = of.plusDays(5);
		System.out.println(of);
		
	}

}
