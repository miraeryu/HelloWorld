package co.edu.twodimension;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		//학생이름, 점수 < names, scores
		student s1 = new student(); //학생이름, 점수
		s1.studName = "홍길동";
		s1.score = 80;
		s1.age = 20;
		
		student s2 = new student();
		s2.studName = "김길동";
		s2.score = 75;
		s2.age = 25;
		
		student s3 = new student();
		s3.studName = "박길동";
		s3.score = 82;
		s3.age = 30;
		
		student[] students = {s1,s2,s3};
		int searchAge =23;
		
		for(int i=0; i<students.length; i++) {
			if(students[i].age>searchAge) {
				System.out.println(students[i].studName +","+students[i].age);
			}
		}
		
		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("학생이름을 입력하세요.");
//		String searchName = scn.nextLine();
//		
//		for(int i=0; i<students.length; i++) {
//			if(students[i].studName.equals(searchName)) {
//				System.out.println(students[i].score);
//			}
//		}
		System.out.println("end of program.");
	}

}
