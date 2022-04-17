package co.edu.statics;
// co.edu.statics.Person = >

//일반적으로 패키지 이름을 정할때
//www.hp.com
//project.hp.com라는 프로젝트를 할때 com.hp.project1.Class..등등..

public class Person {
	final String nation = "Korea";
	final String ssn; //final = 한번 선언하면 변경 불가능
	static final double PI = 3.14; //클래스 소속, 클래스 변경에도 변함없는 일정된 고정값 지정
//	= "상수필드"(모든 스펠링은 대문자로 사용, 띄어쓰기는 언더바_)
	String name;
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
