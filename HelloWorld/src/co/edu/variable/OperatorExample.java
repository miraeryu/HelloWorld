package co.edu.variable;

import java.util.Scanner;

public class OperatorExample {
	public static void main(String[] args) {
		// 75300원
		// 5만원 n개/1만원 n개/5천원 n개/1천원 n개/5백원 n개/1백원 n개
		int ex, yellow, green, orange, blue, coin500, coin100;
		Scanner scn = new Scanner(System.in);
		System.out.println("나눌 현금을 입력하시오.");
		ex = scn.nextInt();
		yellow = ex/50000;
		green = (ex % 50000) / 10000;
		orange = ((ex % 50000) % 10000) / 5000;
		blue = (((ex % 50000) % 10000) % 5000) / 1000;
		coin500 = ((((ex % 50000) % 10000) % 5000) % 1000) / 500;
		coin100 = (((((ex % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		System.out.printf("%5d원의 지폐와 동전 갯수는 5만원권 %1d장, 1만원권 %1d장, 5천원권 %1d장, 1천원권 %1d장, 5백원 %1d개, 백원 %1d개입니다.", ex, yellow, green, orange, blue, coin500, coin100);
	}

}
