package co.edu.condition;

public class IfExample4 {
	public static void main(String[] args) {
		// 임의의 값을 생성해주는 Math.random()
		double randomVal =(int) (Math.random() * 100) + 1; // 반환값이 double 범위 : 0 <= 값 < 1 
		System.out.println(randomVal);
		
		// 생성된 값이 1 ~ 50 까지
		// 생성된 값이 51 ~ 60 까지
		// 생성된 값이 61 ~ 70 , 71 ~ 80, 81 ~ 90 , 91 ~ 100 범위라고 출력
		if (randomVal <= 50 ) {
			System.out.println("1 ~ 50 사이의 수입니다.");
		}else if (randomVal <= 60) {
			System.out.println("51 ~ 60 사이의 수입니다.");
		}else if (randomVal <= 70) {
			System.out.println("61 ~ 70 사이의 수입니다.");
		}else if (randomVal <= 80) {
			System.out.println("71 ~ 80 사이의 수입니다.");
		}else if (randomVal <= 90) {
			System.out.println("81 ~ 90 사이의 수입니다.");
		}else if (randomVal <= 100) {
			System.out.println("91 ~ 100 사이의 수입니다.");
		}
	}

}
