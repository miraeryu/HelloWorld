package co.edu.poly;

public class Tire {
	// 필드
	public int maxRotation; // 타이어 최대 사용횟수, 최대 10;
	public int accumulateRotation; // 현재까지 사용한 회전수
	public String location; // 타이어 위치
	
	
	//생성자
	public Tire(String location, int maxRotation) {//기본생성자
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	
	//메소드
	public boolean roll() {
		accumulateRotation++;
		if (accumulateRotation<maxRotation) {
			System.out.println(location + " Tire수명 " + (maxRotation - accumulateRotation)+"회 남았습니다.");
			return true;
		}else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}

}
