package co.edu.loop;

public class ForExample2 {
	public static void main(String[] args) {
		// 1 ~ 100 반복
		// 31번째 종료
		int sum = 0;
		for(int i = 1; i<=100; i++) {

			if(i == 31) {

				break; //반복문 종료	
			}
			if(i % 2 == 0) {
				System.out.println("현재 i의 값은 " + i);
				continue; //continue 구분 아래 코드는 실행없이 다음 순번으로 넘어감
			}
			sum = sum + i;
		}//순서에 따라 31번까지 실행하기도 함
		System.out.println("sum : " + sum);
		
		
	}

}
