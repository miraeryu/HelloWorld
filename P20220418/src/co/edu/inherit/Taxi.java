package co.edu.inherit;

public class Taxi extends Car {

	// 필드
	String type; // 개인택시, 법인택시

	// 생성자
	public Taxi() {
		System.out.println("Taxi() 생성자 호출");

	}

	// 메소드

	public void metering() {
		System.out.println("요금 계기판");
	}

	@Override
	public String toString() {
		return "택시의 종류는" + type;
	}

//	@Override
//	public void drive() {
//		System.out.println("택시 운행합니다.");
//	}
	
	

}
