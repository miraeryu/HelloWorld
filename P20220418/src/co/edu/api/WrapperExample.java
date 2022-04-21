package co.edu.api;

public class WrapperExample {
	public static void main(String[] args) {
	
		//랩퍼클래스
		//기본데이터 -> 참조데이터
		//int,long,byte -> Integer, Long, Byte
		int n1 = 100; //단순 데이터이기때문에 cntl+space로 메소드 사용불가
		Integer n2 = new Integer(200);// 참조데이터이기때문에 사용가능 / 랩퍼 타입으로 바꾸는것 =>박싱
		n1 = n2;  //?????????????????????언박싱
		n2.byteValue();
		byte b1 = n2.byteValue();
		System.out.println(b1);
		Float f1 = 12.3F;
		
		Integer.parseInt("100");
		Double.parseDouble("123.456");
	}

}
