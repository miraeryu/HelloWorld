package co.edu.abstracts;

public abstract/* 추상 */ class Animal {
//Animal() 생성자로 인스턴스 생성 X

	public Animal() {

	}

	public abstract void eat(); // 하위클래스에서 강제로 구현하도록 함

	public abstract void run();
	
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}

}
