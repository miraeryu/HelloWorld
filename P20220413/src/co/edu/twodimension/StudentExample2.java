package co.edu.twodimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		student s1 = new student();

		System.out.println("학생이름 점수 나이 순으로 입력하시오.");
		s1.studName = scn.next();// 문자열만 읽어올 수 있음string타입
		s1.score = Integer.parseInt(scn.next());// 문자열로 읽으려면 이렇게
		s1.age = Integer.parseInt(scn.next());

//		System.out.println(scn.next());//홍길동 80 20 순으로 입력시 공백을 기준으로 하나씩 입력받음
//		System.out.println(scn.next());
//		System.out.println(scn.next());

		student[] students = { new student(), new student(), new student() };

		students[0].studName = scn.next();
		students[0].score = Integer.parseInt(scn.next());
		students[0].age = Integer.parseInt(scn.next());

		// 조회하고싶은 이름입력
		// 해당이름은 홍길동이고 20살이고 80점입니다.

	}

}
