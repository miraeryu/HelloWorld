package co.edu.interfaces;

public interface RemoteControl {
	//필드 선언 불가, 공통으로 쓰이는 상수는 가능
	public static final int MAX_VOLUME = 10; //수정불가
	
	
	public void turnOn(); //추상 메소드
	public void turnOff();
	public void volumeUp();
	public void volumeDouwn();
	//디폴트 기능으로 자율적 구현 가능
	public default void adjustScreen() {
		System.out.println("화면을 조정합니다.");
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
