package co.edu.array;

import java.util.Scanner;

public class ArrayExample7 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int m;
		System.out.println("월을 입력하세요.");
		m = scn.nextInt();
		int Inth = getLastDay(m);

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };

		int[] intAry = new int[Inth];
		// 배열값을 지정
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = i + 1;
		}
		// 달력 윗부분에 출력(요일)
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);

		} // 줄바꿈
		System.out.println();

		// 달력 숫자부분 입력
		int spc = getDayInfo(m); // 빈 공백부분 입력
		for (int i = 0; i < spc; i++) {
			System.out.printf("%4s", " ");
		}

		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if ((i + spc) % 7 == 6) {
				System.out.println(); // 줄바꿈
			}
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");

	} // end of main();

	// 날짜 수 지정
	public static int getLastDay(int month) {
		switch (month) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;// 요일정보
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
		}
	}
	// 들여쓰기 지정

	public static int getDayInfo(int month) { // 메소드
		switch (month) {
		case 1:
			return 6;
		case 2:
			return 2;
		case 3:
			return 2;
		case 4:
			return 5;// 요일정보
		case 5:
			return 0;
		case 6:
			return 3;
		case 7:
			return 5;
		case 8:
			return 1;
		case 9:
			return 4;
		case 10:
			return 6;
		case 11:
			return 2;
		case 12:
			return 4;
		default:
			return 0;
		}

	}

}
