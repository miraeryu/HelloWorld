package co.edu.array;

public class ArrayExample {
	public static void main(String[] args) {
		// 학생의 점수를 저장 (30명)
		/*int score1 = 80;
		....
		int score30 = 78;*/
		//하나하나 입력하기엔 시간이 너무 오래걸림
		//여러개의 같은 유형의 값을 저장
		int [] intAry = new int[30];  //[] = 정수 int를 30개 담을 공간
		
		intAry[0] = 30;
		intAry[4] = 40;
		intAry[29] = 55; //index가 0부터 시작하기때문에 []에 30을 넣으면 에러가 발생함
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]); // 0으로 출력. int타입 기본값은 0이므로 0으로 출력됨
		
		double [] dblAry = new double[10]; //doulble 저장공간 10개 선언
		
		System.out.println(dblAry[1]);// double 기본값 0.0
		
		String[] strAry = new String[5]; //참조변수 기본값 = null
		System.out.println(strAry[0]);
		
		int[] otherAry = {10, 20, 30, 40};//초기값 지정
		int[] theOtherAry = {10, 20, 30, 40};
		System.out.println(otherAry[0]);
		System.out.println(otherAry[1]); // 지정한 초기값 순서대로 나옴
		
		if(otherAry == theOtherAry) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		} //다른 주소값을 가지고 있기 때문에 초기값을 같게 지정해도 다르게 나옴
		if(otherAry[0] == theOtherAry[0]) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		} //same결과값 출력
		
		
	}

}
