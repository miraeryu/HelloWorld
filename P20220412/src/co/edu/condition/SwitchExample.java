package co.edu.condition;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("피자의 종류를 입력하세요.");
		String result = scn.nextLine();//사용자가 입력한 문자열을 읽어옴
		int price = 0;

		switch(result) {
		case "페퍼로니" :  // 동일한 결과값 내에서는 가능
		case "불고기" :
			price = 21000; break;
		case "포테이토" :
			price = 18000; break;
		case "쉬림프" :
			price = 25000; break;
			
			
		default : 
			price = 0;
			
		}
		System.out.println("피자 " + result + "의 값은" + price + "입니다.");
	}

}
