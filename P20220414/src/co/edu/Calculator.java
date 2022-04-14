package co.edu;

public class Calculator {
	private double pi = 3.14;

	// 리턴타입 없는것
	void printPI() {
		System.out.println("원주율은 " + pi);
	}

	void getArea(double radius) {
		double area = pi * radius * radius;
		System.out.println("반지름 " + radius + "의 넓이는 " + area);
	}

	// 리턴타입 있는것.
	// 메소드의 로버로딩 = 동일한 이름의 메소드가 있을때 발생
	int sum(int num1, int num2) {
		return num1 + num2;
	}

	double sum(double n1, double n2) {
		return n1 + n2;

	}

	double getTriangleArea(double s1, double s2) {
		return (s1 * s2) / 2;
	}

	// 매개변수 클래스, 배열,
	int sum(int[] ary) {// 배열값만큼 다 더하는 기능
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];

		}
		return sum;

	}

	double average(int n1, int n2, int n3) {
		return (n1 + n2 + n3) / 3.0;
	}
	
	double average (int... args) {
		int sum = 0;
		for(int i=0; i<args.length;i++) {
			sum += args[i];
		}
		return (double) sum / args.length;
	}

}
