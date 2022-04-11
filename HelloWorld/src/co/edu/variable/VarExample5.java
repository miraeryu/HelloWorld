package co.edu.variable;

public class VarExample5 {
	public static void main(String[] args) {
		int val = 2147483647; // 4 * 1byte => 1byte = 8 * bit; 값이 on/off
		
		System.out.println(Integer.MAX_VALUE);
		
		long val2 = 2147483648L;
		long val3 = 10L; // 10 -> long 타입으로 변환(promotion).
		
		int val4 = (int) 2147483648L; //long -> int (casting:강제형변환)
		
		int result = (int) (1000000000000L / 5); //
		
		long val5 = 1000000000000L;
		long val6 = 10L;
		
		result = (int) (val5 - val6); //casting(강제형변환);
		
		char charLit = 97; // 0~65535 까지의 정수값에 전세게의 문자를 매핑해놓음
		
		charLit = 44032;
		
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(result);
		System.out.println((int)charLit);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		
	}

}
