package co.edu.variable;

import java.util.Scanner;
//

public class IfExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("첫번째 정수를 입력하세요.");
		num1 = scn.nextInt(); //사용자입력값을 읽고 int형 반환
		System.out.println("두번째 정수를 입력하세요.");
		num2 = scn.nextInt();
		
		if(num1 > num2) {
			int result = (num1 - num2);
			System.out.println("둘의 차는 " + result + "입니다.");
			
		}else {
			int result = (num2 - num1);
			System.out.println("둘의 차는 " + result + "입니다.");
		}
		
	}

}
