package co.edu;

public class OperatorExample3 {
	public static void main(String[] args) {
		//논리연산자/비교연산자 사용
		int num1 = 10;
		int num2 = 20;
		if(num1 == num2) {
			System.out.println("두 수는 같습니다.");
		}
		if (num1 != num2) {
			System.out.println("두 수는 같지않습니다.");
		}
		if (num1 >= num2) {
			System.out.println(num1 + "이 " + num2 + "보다 큽니다.");
		}
		if((++num1 % 2 == 0) && (num2++ % 2 == 0)) { //or
			System.out.println("두 수는 짝수");
		}else {
			System.out.println("두 수는 짝수가 아닙니다.");
		}
		
		System.out.println(num1 + "," + num2);
		if((++num1 % 2 == 0) || (num2++ % 2 == 0)) { //and
			System.out.println("두 수 중 하나이상은 짝수");
		}else {
			System.out.println("두 수가 짝수가 아닙니다.");
		}
			System.out.println(num1 + "," + num2);
			System.out.println("end of program");
		
		
	}

}
