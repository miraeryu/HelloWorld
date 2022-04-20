package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("1.추가 2.종료");
			System.out.print("선택>>");
			int menu = 0;

			try {
				Class.forName("java.lang.String"); // Exception 컴파일러가 알아서 예외를 잡아줌
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}

			try {
				menu = Integer.parseInt(scn.next()); // scn.nextInt();
			} catch (ArrayIndexOutOfBoundsException e) { // RuntimeException 예외 발생시 코드 직접 입력해야함
				System.out.println("배열의 범위 넘어서 처리하려고합니다.");
			} catch (InputMismatchException | NumberFormatException e2) {
				System.out.println("숫자선택");
				scn.nextLine();
			} catch (Exception e3) { // 모든 예외 처리 가능
				System.out.println("알 수 없는 에러가 발생했습니다.");
			} finally {
				System.out.println("예외 처리에서 반드시 한번은 실행");
			}

			if (menu == 1) {
				System.out.println("추가작업");
			} else if (menu == 2) {
				break;
			}
		}
		System.out.println("end of program");
	}

}
