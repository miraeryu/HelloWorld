package co.edu.interfaces;


//인터페이스가 구현클래스를 통해 구현되어야함
public class Television implements RemoteControl{// 인터페이스는 implements 상속은 extends

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("tv 볼륨을 올립니다.");
	}

	@Override
	public void volumeDouwn() {
		// TODO Auto-generated method stub
		System.out.println("tv 볼륨을 내립니다.");
	}

	@Override
	public void adjustScreen() {
		// TODO Auto-generated method stub
//		RemoteControl.super.adjustScreen();
		System.out.println("tv의 화면을 조정합니다.");
	}

	
	
	
	
}
