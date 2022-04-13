package co.edu;

public class RefrerenceExample {
	public static void main(String[] args) {
		//기본타입
		
		int num1 = 100;
		int num2 = 100;
		
		if(num1 == num2) {
			System.out.println("같은 값입니다.");
		}else {
			System.out.println("다른 값입니다.");
		}
		
		//참조타입
		
		String str1 = new String("홍길동"); // 인스턴스
		String str2 = new String("홍길동"); // 인스턴스
		
		str1 = null;
		str1 = "김길동";
		
//		if(str1 == str2) { 		//참조변수 = 주소값 비교. 생성 주소 위치가 다르기 때문에 동일값이 나오지 않음
		if(str1.equals(str2)) { // 같은값을 비교하기 위해서는 메소드를 써야함. string 클래스는 equals를 사용
			System.out.println("같은 값입니다.");
		}else {
			System.out.println("다른 값입니다.");
		}
		
	}

}
