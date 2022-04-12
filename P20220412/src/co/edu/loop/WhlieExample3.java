package co.edu.loop;

import java.util.Scanner;

public class WhlieExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	double randomVal = (int) (Math.random()*10) +1;	

	boolean isTrue = true;
	while(isTrue){
		System.out.println("숫자를 입력하세요.");
		int userVal = scn.nextInt();
		if(randomVal > userVal) {
			System.out.println("입력한 숫자보다 큽니다.");
		}else if(randomVal < userVal) {
			System.out.println("입력한 숫자보다 작습니다.");
		}else {
			System.out.println("입력한 숫자와 같습니다. 프로그램 종료");
			isTrue = false;
			continue;
		}

	}
	}

}
