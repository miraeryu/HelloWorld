package co.edu.abstracts;

public class Bird extends Animal {// 구현되지 않은 메소드가 있을때 에러발생

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("새가 먹이를 먹습니다.");
	}

	@Override
	public void run() {
		System.out.println("새가 날아갑니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		System.out.println("새가 잠을 잡니다.");
	}

}
