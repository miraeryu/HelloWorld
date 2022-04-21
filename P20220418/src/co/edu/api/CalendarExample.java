package co.edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		
		int year = 2020;
		int month = 5;
		
		
		Calendar today = Calendar.getInstance();
		today.set(year, month-1,1);
		System.out.println("년도 : " + today.get(Calendar.YEAR));
		System.out.println("월 : " + today.get(Calendar.MONTH)); //0부터 시작
		System.out.println("일 : " +today.get(Calendar.DAY_OF_MONTH)); //date도 가능
		System.out.println("요일 : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막날 : " +today.getActualMaximum(Calendar.DATE));
		
		/////////////////////////////////////////////////////////
		
		Date todate = new Date();
		System.out.println(todate);
		todate = new Date("2021/05/05"); // YYYY/MM/DD 형식으로만 지정 가능
		todate.setYear(2022); // 1900+2022 = 3922년이 됨
		System.out.println(todate);
		
		LocalDate ldate = LocalDate.of(2022, 10, 10);
		System.out.println(ldate.toString());
		
		LocalTime ltime = LocalTime.of(10, 10, 10);
		System.out.println(ltime.toString());
		
		LocalDateTime ldt = LocalDateTime.now();
		ldt = LocalDateTime.of(2022, 10, 5, 10, 20, 30);

		
		//		System.out.println(ldt.toString());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(ldt.format(dtf));
		
		
	}

}
