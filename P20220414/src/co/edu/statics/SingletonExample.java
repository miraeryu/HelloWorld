package co.edu.statics;

class Car{
	
}

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();    =>생성불가 private로 막아놨기때문
		Singleton s1 = Singleton.getInstance();  //Singleton.getInstance();로 생성 접근가능
		
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		
	}

}
