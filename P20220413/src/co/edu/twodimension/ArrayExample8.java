package co.edu.twodimension;

import java.util.Scanner;

public class ArrayExample8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		
		//변수vs배열
		// 변수활용
		int num1, num2, num3;
		System.out.println("첫번째 값을 입력하시오.");
		num1 = scn.nextInt();
		System.out.println("두번째 값을 입력하시오.");
		num2 = scn.nextInt();
		System.out.println("세번째 값을 입력하시오.");
		num3 = scn.nextInt();
		
		int[] intAry = { num1, num2, num3 };
		for (int j= 0; j <intAry.length -1; j++) {
		for(int i = 0; i <intAry.length - 1; i++) {
			if(intAry[i] > intAry[i +1]) {
				int temp =intAry[i];
				intAry[i] = intAry[i+1];
				intAry[i+1] = temp;
			}
		}
		}
		System.out.println(intAry[0] +","+ intAry[1] +","+ intAry[2]);
		
		//제일 작은 수~ 제일 큰 수 순으로 출력
	/*	if(num1 > num2) {
			if(num2 > num3) {
				System.out.println(num3 +","+ num2 +","+ num1);
			}else {
				System.out.println(num2 +","+ num3 +","+ num1);
			}
		}else if (num2 >num1){
			if(num1 > num3) {
				System.out.println(num3 +","+ num1 +","+ num2);
			}else {
				System.out.println(num1 +","+ num3 +","+ num2);
			}
			
		}else if (num3 >num1) {
			if(num1>num2) {
				System.out.println(num2 +","+ num1 +","+ num3);
			}else {
				System.out.println(num1 +","+ num2 +","+ num3);
			}
		}
		*/
		
		
	}

}
