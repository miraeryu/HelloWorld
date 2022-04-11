package co.edu.variable;

public class VarExample2 {
	public static void main(String[] args) {
		// 국어점수 80, 영어70, 수학69
		// 평균 변수 선언 ( + + )/3
		int korean = 80;
		int eng = 70;
		int math = 63;
		int result = (korean + eng + math)/3 ;
		
		// 값 변경
		
		korean = 85;
		eng = 75;
		math = 60;
		result = (korean + eng + math)/3 ;
		
		// 소수점 출력으로 변경
		
		double avg = (korean + math + eng)/3.0;
		
		
				System.out.println(korean + "점, " + eng + "점, " + math + "점이 평균 : " + avg + "입니다." );
	}

}
