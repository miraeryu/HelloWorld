package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
			System.out.println(array[i]);
			sum += array[i];
		}
		avg = sum / 10.0;
		int[] newarray = new int[10];
		for (int i = 0; i < array.length; i++) {
				if (avg < array[i] && newarray[i] == 0) {
					newarray[i] = array[i];
				}
		}
		System.out.println("============================");
		System.out.println("이 중 평균보다 큰 수는 다음과 같다");
		for (int i = 0; i < newarray.length; i++) {
			if (newarray[i] != 0) {
				System.out.printf(newarray[i] + " ");
			}
		}
	}

}
