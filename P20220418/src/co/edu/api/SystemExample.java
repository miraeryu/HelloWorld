package co.edu.api;

public class SystemExample {
	public static void main(String[] args) {
		System.out.println("Start");
//		System.exit(0);// 프로그램 종료
		System.out.println("End");

		long start = System.currentTimeMillis();
		start = System.nanoTime();
		long sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println(end-start);
	}

}
