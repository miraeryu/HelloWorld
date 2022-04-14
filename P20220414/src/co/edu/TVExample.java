package co.edu;

public class TVExample {
	public static void main(String[] args) {// 메인 메소드의 존재 >> 호출을 의미

		int num = 10;
		String str = "Hello";

		Television tv = new Television(); // Television파일에서 가져옴
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 300000;
		tv.model = "30Inch";
		// instance(실체)를 하나 만든 것 , 괄호없음 = 속성 괄호있음 = 메소드
		tv.turnOn();
		tv.changeChannel(10);
		tv.turnOff();
		// 출력해보면 Television.java에서 입력한 부분이 그대로 나옴

		System.out.println("---------------------------------------");

		Television tv1 = new Television(); // 새로운 tv 추가 tv !=tv1
		// new 키워드 >> heap영역에 인스턴스 생성
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 300000;
		tv.model = "30Inch";

		System.out.println(tv);
		System.out.println(tv1); // 각각의 주소값이 나옴
		System.out.println(tv == tv1); // 각각의 주소값이 다르기때문에 정보가 일치하더라도 다르다고 나옴

		System.out.println("---------------------------------------");

		Student stud1 = new Student();
		stud1.name = "홍길동";
		stud1.studNo = "22-1234567";
		stud1.age = 20;
		stud1.height = 174.5;

		Student stud2 = new Student();
		stud2.name = "박길동";
		stud2.studNo = "22-3333345";
		stud2.age = 22;
		stud2.height = 167.3;

		Student stud3 = new Student();
		stud3.name = "김길동";
		stud3.studNo = "22-4156234";
		stud3.age = 30;
		stud3.height = 183.1;

		Student stud4 = new Student("이길동", "22-8315242"); // cntl + 클릭으로 호출 장소 이동가능
		stud4.age = 25;
		stud4.height = 163.5;
		
		Student stud5 = new Student("백길동", "22-6423584", 28, 158.3);

		stud1.study();
		stud2.study();

		stud1.showInfo();
		stud4.showInfo();
		stud5.showInfo();

	}

}
