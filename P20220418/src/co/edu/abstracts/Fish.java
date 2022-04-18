package co.edu.abstracts;

public class Fish extends Animal{

	@Override
	public void eat() {//반드시 재정의 필요
		// TODO Auto-generated method stub
		System.out.println("물고기가 먹이를 먹습니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("물고기가 헤엄을 칩니다.");
	}

	@Override
	public void sleep() {
		System.out.println("물고기가 잠을 잡니다.");
	}

}
