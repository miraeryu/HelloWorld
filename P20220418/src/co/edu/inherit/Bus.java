package co.edu.inherit;

public class Bus extends Car {

	// 필드
	String busNo;

	// 생성자

	public Bus() {
		super(); // 부모자식관계에서 super =부모, 부모가 가진 기본생성자 호출하겠다는 의미
		System.out.println("Bus() 생성자 호출");
	}

	// 메소드
	public void fee() {
		System.out.println("요금을 받습니다.");
	}

	@Override
	public void drive() { // 부모클래스에게 있는것을 자식클래스가 다시 정의 =오버라이딩

		System.out.println("버스가 운행합니다.");
		
		
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ",moder = " +super.model + "]";
//		return super.toString();
	}

}
