package co.edu;

public class BitOperatorExample {
	public static void main(String[] args) {
		int num = 8;
		
		int result = num << 2; //비트 연산자 비트를 왼쪽으로 두번 이동시키겠다는 의미임.
		// 8 = (2)100 이고 위의 결과값 적용 => (2)10000
		System.out.println(result);
		num = 10; // 1010 => 101000 = (10)40
		result = num << 2;
		System.out.println(result);
		result = num >> 2;
		System.out.println(result);
	}

}
