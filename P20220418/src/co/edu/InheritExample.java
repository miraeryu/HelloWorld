package co.edu;

public class InheritExample {
	public static void main(String[] args) {

		// 부모클래스에 있는걸 자식클래스가 상속받아 그대로 사용가능
		Child1 c1 = new Child1();
		c1.field1 = "";// 부모클래스 필드
		c1.field2 = "";// 자식클래스 필드

		c1.method1();
		c1.method2();

		Child2 c2 = new Child2();
		c2.field1 = "";// 부모필드
		c2.field3 = "";// 자식필드
		c2.method3();
		c2.method1();

		// 부모의 참조변수에 자식 인스턴스를 할당 가능
		Parent p1 = new Parent(); // 자식의 인스턴스를 부모클래스에 할당 가능
		p1 = new Child1(); // 자동 형변환(promotion)이 일어남
		p1 = new Child2();

		p1.field3 = ""; // 부모가 가진 필드,메소드만 활용가능

		c2 = (Child2) p1; // 강제형변환 가능
		c2.field1 = "";
		c2.field3 = "";
	}

}
