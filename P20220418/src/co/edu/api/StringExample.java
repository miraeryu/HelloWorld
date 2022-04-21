package co.edu.api;

import java.util.Calendar;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		// 주민번호 => 생년월일 남-/여구분
		// 950405-2345678 =>95년 4월 5일생, 여자입니다 출력
		System.out.println("주민번호를 입력하세요. -을 제외하고 숫자 13자리를 입력하세요.");
		Scanner scn = new Scanner(System.in);
		String insertID = scn.next();
		String result = checkInfo(insertID);
		System.out.println(result);

//		StringExample.checkInfo(result);
	}

	public static String checkInfo(String jumin) {

		String year = jumin.substring(0, 2);
		String month = jumin.substring(2, 4);
		String day = jumin.substring(4, 6);
//		System.out.print(year + "년 " + month + "월 " + day + "일 생,");

		char number7 = jumin.charAt(7);
		String gender = null;
		switch (number7) {
		case '1':
		case '3':
//			System.out.println("남자입니다.");
			gender = "납자입니다.";
			break;
		case '2':
		case '4':
//			System.out.println("여자입니다.");
			gender = "여자입니다.";
			break;
		}

		return year + "년 " + month + "월 " + day + "일 생, " + gender;
	}

}
