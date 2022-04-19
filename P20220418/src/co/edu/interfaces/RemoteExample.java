package co.edu.interfaces;

public class RemoteExample {
	public static void main(String[] args) {

//		RemoteControl re = new RemoteControl; // 인터페이스는 인스턴스 생성불가
		// 상속관계에서는 부모클래스의 참조변수 자식클래스의 인스턴스가 할당
		RemoteControl rc = null;
		rc = new Television();
//		rc = new Audio();

		rc.turnOn();
		rc.turnOff();
		rc.volumeUp();
		rc.volumeDouwn();

		RemoteControl.changeBattery();

	}

}
