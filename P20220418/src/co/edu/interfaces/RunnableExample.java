package co.edu.interfaces;

//구현클래스 클래스명
interface Runnable {
	public void run();
}

class RunClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("웁직입니다.");
	}

}

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();

		runnable = new Runnable() {// 익명의 구현객체 =>람다표현식의 조건

			@Override
			public void run() {
				System.out.println("멍멍이가 달립니다.");
			}

		};
		runnable.run();
		
//		runnable = new Runnable(){
//			
//			public void run() {
//				System.out.println("야옹이가 달립니다.");
//			}
//		};
		
		runnable = () ->{
			System.out.println("야옵이가 달립니다.");
		};
		
		runnable = () -> System.out.println("야옹이가 달립니다.");
		//주석처리부분과 아래 모두 가능. 람다표현식
		
		runnable.run();	
	}

}
