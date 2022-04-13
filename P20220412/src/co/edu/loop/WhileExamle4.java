package co.edu.loop;

public class WhileExamle4 {
	public static void main(String[] args) {

		// 구구단 출력
		for (int dan = 2; dan <= 9; dan++) {

			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}

		}

//		*
//		**
//		***
//		****
//		*****
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------");

		for (int j = 1; j <= 5; j++) {
			for (int i = 5; i >= j; i--) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("-------------------");
		for (int j = 1; j <= 5; j++) {
			for (int i = 5; i >= j; i--) {
				System.out.printf(" ");

			}
			for (int i = 1; i <= j; i++) {
				System.out.printf("*");
			}
			System.out.println();

		}
		System.out.println("-------------------");

	}
}
