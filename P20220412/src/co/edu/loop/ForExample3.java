package co.edu.loop;

public class ForExample3 {
	public static void main(String[] args) {
		// 1 ~ 100 번 반복
		// 최초로 sum의 값이 1000보다 커질 때 
		int sum = 0;
		int cnt = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i ;
		if(sum >= 1000) {
			cnt = i;
			break;
		}
		}
		
		System.out.println("1000보다 큰 최소합계 : " + sum + ", 순번 : " + cnt );
		
		
		// 1 ~ 10 반복
		// sum = sum * 1;
		
		int sum2 = 1;
		
		for(int i = 1; i<=10; i++) {
			sum2 = sum2 * i;
		}
		
		
		System.out.println("1 ~ 10까지 곱한 결과 : " + sum2);
		
		
		// 숫자 100의 약수를 출력
		
		int sum3 = 100;
		int sum4 = 0;
		for(int i = 1; i<=100; i++) {
			sum4 = sum3 / i;
			if(sum3 % i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
