package co.edu.variable;

public class IfExample {
	public static void main(String[] args) {
		int myAge = 19;
		boolean over20; // 변수의 길이는 상관x 의미있는 변수명 사용 필수 (코드가 길어지면 알 수 없는 경우가 많아짐)
		//class 외에는 다 소문자로 시작할 것
		over20 = myAge > 20; // over20 == myAge > 20
		if(over20) {
			System.out.println("over 20");
		} else {
			System.out.println("under 20");
		}
	}

}
