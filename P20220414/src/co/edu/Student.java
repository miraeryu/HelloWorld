package co.edu;

public class Student {// 메인 메소드 필요X
	// 필드
	String name;
	String studNo;
	int age;
	double height;

	// 생성자 >> 인스턴스를 만들어줄때 처리할 기능 정의
	//매개값이 없는 생성자 = 기본 생성자
	// 기본 생성자
	public Student() {
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	//생성자는 필드 값을 지정할때 많이 사용
	public Student(String nm, String sn) {
		name = nm;
		studNo = sn;
	}
	
	public Student(String n, String no, int agee, double ki) {
		name = n;
		studNo = no;
		age = agee;
		height = ki;
	}

	
	// 메소드
	void study() {
		System.out.println(name + " 학생이 공부를 합니다.");
	}

	void eat() {
		System.out.println(name + " 학생이 식사를 합니다.");
	}

	void showInfo() {
		System.out.println("이름은 " + name + ", 학생번호는 " + studNo + ", 나이는 " + age + ", 키는 " + height + "입니다.");
	}

}
