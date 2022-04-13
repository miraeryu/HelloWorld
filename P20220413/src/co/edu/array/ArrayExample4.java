package co.edu.array;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		// 정수 1~30 범위의 임의 값 생성
		int sum = 0;
		/*
		 * (int) (Math.random()*30)+1; math.random = 0.0~0.99999출력 (int)로 정수화 가능 정수를 얻고
		 * 싶다면->(Math.random()*10) =>0.0~9.9999999까지 출력된다 1~10까지를 원함->(int)
		 * (Math.random()*10)+1 ->1.0~10.999999까지 출력->정수이므로 1~10까지 출력 5~20까지를 원함 ->(int)
		 * (Math.random()*16)+5 ->0.0~15.99999 + 5 =>5.0~20.999 => 정수이므로 5~20까지 출력
		 * 
		 * 
		 * 
		 * ************정수로 범위 지정시 (int) (Math.random()*[범위 내 들어가는 수의 갯수])+최소값 **********
		 * 
		 * 
		 * 
		 */
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 30) + 1;
			System.out.println(intAry[i]);
			if (intAry[i] > 15) {
				sum += intAry[i];
				System.out.println("합계에 더합니다.");
			}
		}
		System.out.println("15보다 큰 수의 합계는 " + sum + "입니다.");
		// 반복문 활용 임의값 5개 저장

	}

}
