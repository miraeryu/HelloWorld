package co.edu.interfaces;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("오디오의 볼륨을 올립니다.");
	}

	@Override
	public void volumeDouwn() {
		// TODO Auto-generated method stub
		System.out.println("오디오의 볼륨을 낮춥니다.");
	}

}
