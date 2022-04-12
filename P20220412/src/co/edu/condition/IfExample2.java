package co.edu.condition;

public class IfExample2 {
	public static void main(String[] args) {
		//
		int num = 12;
		
		//2의 배수인가? 3의 배수인가? 2와3의 공통배수인가? 공통배수일경우 이를 먼저 출력학기를 원함
		if ( num % (2*3) == 0) {
			System.out.println(num + "는 2와 3의 공통배수입니다.");
		}else if (num % 3 == 0) {
			System.out.println(num + "는 3의 배수입니다.");
		}else if (num % 2 == 0) {
			System.out.println(num + "는 2의 배수입니다.");
		}else {
			System.out.println(num + "는 2와 3의 배수가 아닙니다.");
		}
		
		}
	}


