package co.edu;

public class CalExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(); /// 생성자 호출

		c1.printPI(); // 매개값 안 넣어도 상관 x
		c1.getArea(2.4);// 매개값 없으면 에러가 남. double 타입의 무언가를 넣어줘야함.
//		int result = c1.getArea(2.4); ==>에러 발생. 리턴값이 나오지않기때문임

		int result = c1.sum(30, 23); // 메소드를 호출하는 부분. 이미 타입이 정해져있기때문에 값만 넣으면 됨. int double 등 입력 필요 x
		// 리턴값 받을 수 있음.
		System.out.println("두수의 합: " + result);
		double result1 = c1.sum(23.4, 30);
		System.out.println("두 수의 합 : " + result1);

		// 밑변과 높이를 입력 >> 삼각형의 넓이 계산 메소드 만들기 이름은 getTriangleArea, double타입
		double result2 = c1.getTriangleArea(3, 4);
		System.out.println("삼각형의 넓이는 " + result2);

		int[] intAry = { 10, 20, 30, 40 };
		result = c1.sum(intAry);
		System.out.println("배열의 합 : " + result);

		result1 = c1.average(3, 4, 5);
		System.out.println("평균: " + result1);
		
		result2 = c1.average(10,20,30,40,50);
		System.out.println("평균: " + result2);
	}

}
