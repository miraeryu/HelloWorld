package co.edu.loop;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 2.출금 3.조회 4.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택>>>");
			int menu = scn.nextInt();
			
			if(menu == 1) {
				//예금기능
				System.out.print("예금할 금액을 입력하세요.");
				int money = scn.nextInt();
				balance += money;
				System.out.println("현재 잔고는 " + balance + "원입니다.");
				System.out.println("예금이 성공적으로 완료되었습니다.");
			}else if(menu == 2) {
				//출금기능
				System.out.println("출금할 금액을 입력하세요.");
				int money = scn.nextInt();
				if(balance < money) {
					System.out.println("출금할 수 없는 금액입니다. 잔고가 부족합니다.");
					System.out.println("이전 메뉴로 돌아갑니다.");
				}else if(balance >= money){
					balance -= money;
				System.out.println("현재 잔고는 " + balance + "원입니다.");
				System.out.println("출금이 성공적으로 완료되었습니다.");
				}

			}else if(menu == 3) {
				//조회기능
				System.out.println("잔고 >" + balance);
				System.out.println("이전 메뉴로 돌아갑니다.");
			}else if(menu == 4) {
				//프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		}// end of while(run);
		
		System.out.println("프로그램 종료");
		
	}

}
