package co.edu;
// 객체(object) >> 도면(설계도,class) >> 텔레비전(instance)
// 추상화(텔레비전의 모든 속성을 다 정의하는 것이 아니라 필요한 것만 우선적으로 정의하는것)
public class Television {
	// 속성과 기능을 우선적으로 정리함(메인 메소드 필요X)
	
	
	//속성 (속성 - 속성명 순으로 정렬) >> 필드
	String company;
	String model;
	int price;
	String color;

	//기능(메소드로 정리) >> 메소드(반환유형, 메소드명, 매개변수(없어도됨) 3가지 정보 필요)
	void turnOn(){
		System.out.println("텔레비전을 켭니다.");
	}
	void turnOff(){
		System.out.println("텔레비전을 끕니다.");
	}
	
	void changeChannel(int channel){
		System.out.println(channel + "번 채널로 변경합니다.");
	}
	

}
