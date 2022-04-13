package co.edu.array;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[] intAry = { 78, 83, 88, 92, 63 };

		// 합을 구하는 코드 작성
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
			sum += intAry[i];
			cnt++;
		}
		System.out.println("합계는 " + sum);

		double avg = 1.0 * sum / cnt;
		System.out.println("평균은 " + avg);

		System.out.println("------------------");

		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < 5; i++) {
			if ((i % 2) == 0) {
				System.out.println("홀수값" + intAry[i]);
				sum2 += intAry[i];
			} else {
				System.out.println("짝수값" + intAry[i]);
				sum3 += intAry[i];
			}
		}
		System.out.println("홀수값의 합계는 " + sum2);
		System.out.println("짝수값의 합계는 " + sum3);

		System.out.println("------------------");
		System.out.println(intAry.length);

		sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
			sum += intAry[i];
		}
		System.out.println(intAry.length);

	}

}
