package co.edu.statics;

public class Singleton {
	
	Car car;  //접근성 테스트
//	SingletonEx single; 원칙상 퍼블릭 클래스는 클래스당 하나이기때문에 오류가 남.

	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

//	static Singleton getInstance() {  해당 항목으로는 다른 패키지에서 접근 불가능.
//		return singleton;
//	}
	public static Singleton getInstance() {  //public : 다른 패키지에서도 접근할 수 있게 하는 타입
		return singleton;
	}

}
