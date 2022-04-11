package co.edu.variable;

import java.util.Scanner;

public class GetAverage {
	public static void main(String[] args) {  
		int num1, num2, num3;
		Scanner scn = new Scanner(System.in);
		int age = 10;
		String myName = "홍길동";
		
		
		System.out.println("첫번째 정수를 입력하세요."); //입력지문
		num1 = scn.nextInt(); //사용자가 입력
		System.out.println("두번째 정수를 입력하세요.");
		num2 = scn.nextInt();
		System.out.println("세번째 정수를 입력하세요.");
		num3 = scn.nextInt();
		
		double avg = 40 / 3.0;
		double result = (num1 + num2 + num3)/3.0;
		
		System.out.println("입력한 세 정수는 " + num1 + "," + num2 + "," + num3 + "이고 평균은 " + result + "입니다.");
		System.out.printf("이름은 %3s이고 평균은 %.2f이고 나이는 %2d", myName, avg, age); //p.91
		
		System.out.printf("입력한 세 정수는 %2d, %2d, %2d이고 평균은 %-2f입니다.", num1, num2, num3, result);
		
	}

}
