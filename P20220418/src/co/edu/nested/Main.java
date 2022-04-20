package co.edu.nested;

import co.edu.nested.Outer.Inner1;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method1();
		
		// instance 멤버클래스
		Outer.Inner1 inner = outer.new Inner1();
		inner.method2();
		
		// static 멤버클래스
		Outer.Inner2.method5(); 
		
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4();//인스턴스 메소드
		inner2.method5();//정적메소드
		
		//instance vs. static
//		Inner inner = outer.new Inner(); //단독으로는 실행 불가. outer를 꼭 붙여줘야함!
//		Inner inner = new Inner(); //정적 클래스 시에는 바로 소환이 됨
		inner.method2();
		
	}

}
