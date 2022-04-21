package co.edu.api;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		String y = "2020";
		String m = "06"; //"06"또는 "6"
		
		showCal(y,m);
	}
	public static void showCal(String year, String month) {
		//달력출력
		int yy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		Calendar today = Calendar.getInstance();
		today.set(yy, mm, 1);
		String[] days = {"SUN", "MON", "TUE", "WED", "THR", "FRI", "SAT"};
		System.out.println("===============================");
		System.out.println("           CALENDAR      ");
		System.out.println("          "+yy+"년 "+mm+"월");
		System.out.println("===============================");
		for (int i = 0; i<days.length; i++) {
			System.out.printf("%4s",days[i]);
		}
		
		
		
		
//		System.out.println("년도 : " + today.get(Calendar.YEAR));
//		System.out.println("월 : " + today.get(Calendar.MONTH)); //0부터 시작
////		System.out.println("일 : " +today.get(Calendar.DAY_OF_MONTH)); //date도 가능
//		System.out.println("요일 : " + today.get(Calendar.DAY_OF_WEEK));
//		System.out.println("마지막날 : " +today.getActualMaximum(Calendar.DATE));
	}

}
