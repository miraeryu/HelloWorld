package co.edu.variable;

import java.util.Scanner;

public class TemperChange {
	public static void main(String[] args) {
		int temperF;
		double temperC;
		Scanner scn = new Scanner(System.in);
		System.out.println("화씨온도를 입력하시오.");
		temperF = scn.nextInt();
		temperC = 5.0/9*(temperF - 32); // 다 정수로 하면 정수로 리턴되기때문에 소수점을 하나 찍어준다.
		System.out.printf("화씨온도 %2d의 섭씨온도는 %.1f입니다.", temperF, temperC);
	}

}
