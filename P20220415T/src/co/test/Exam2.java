package co.test;

// 조건문과 반복문.
// 
// Math.random()을 사용해서 1  ~ 10사이의 임의의 수를 추출.(10번 반복작업 수행) 
// 2의 배수와 3의 배수의 합계를 각각 구하도록 하세요.
// 6의 경우에는 2와 3의 배수이므로 2의 배수와 3의 배수의 합계에 각각 더해지도록 하세요.
// 2의 배수의 합: xxx , 3의 배수의 합 : yyy 로 결과 출력
public class Exam2 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int sum2 = 0;
		int sum3 = 0;
		for(int i=0; i<array.length; i++) {
			array[i] = (int) (Math.random()*10)+1 ;
			System.out.println(array[i]);
			if (array[i]%2 == 0) {
				sum2 += array[i];
			}else if (array[i]%3 == 0) {
				sum3 += array[i];
			}
			

		}
		System.out.println("2의 배수의 합 : " + sum2 + ", 3의 배수의 합 : " + sum3);
		
	}
}
