package co.edu.array;

import java.util.Scanner;

public class ArrayExample6 {
	public static void main(String[] args) {
		
		//학생이름, 점수 둘 다 출력
		//배열을 따로 지정해서 한꺼번에 출력
		
		Scanner scn = new Scanner(System.in);
		
		String[] names = new String[3]; //학생이름
		int[] scores = new int[3]; //학생점수
		
		for(int i = 0; i<names.length; i++) {
			System.out.println("학생이름을 입력하시오.");
			names[i] = scn.nextLine();//문자열은 Line입력
			System.out.println("해당 학생의 점수를 입력하시오.");
			scores[i] = scn.nextInt();
			scn.nextLine();
		}
		System.out.println("조회할 학생의 이름을 입력하시오.");
		String searchName = scn.nextLine();
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(searchName)) {//문자비교시에는 equals 필수
				System.out.println(searchName + "학생의 점수는 " + scores[i] + "점 입니다.");
			}
		}
		
		System.out.println("end of program");
		
		
		
	}

}
