package co.test;

import java.util.Scanner;

// 변수 선언과 제어문 활용.
// 정수값을 받는 변수를 3개 선언하고 num1, num2, num3 의 변수에 저장.
// 제일 큰 값을 구하도록 기능을 구현하세요.
// 결과 => 3 수 중에서 가장 큰값은 100 입니다.
public class Exam1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 , num2, num3;
		System.out.println("정수 3개를 입력하면 그 중 제일 큰 값을 구합니다.");
		System.out.println("첫 번째 정수를 구하시오.");
		num1 = scn.nextInt();
		System.out.println("두 번째 정수를 구하시오.");
		num2 = scn.nextInt();
		System.out.println("세 번째 정수를 구하시오.");
		num3 = scn.nextInt();
		if (num1> num2 && num1 > num3) {

				System.out.println(num1);
			
		}else if (num2>num1 && num2>num3) {
				System.out.println(num2 );
			}
		else if (num3 > num2 && num3>num1){
				System.out.println(num3);
			}
		}
		// 코드 작성.
		
	}

