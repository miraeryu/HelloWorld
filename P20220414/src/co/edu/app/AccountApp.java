package co.edu.app;
//은행 입출금 기능

//메뉴 1.계좌생성 2. 입금 3.출금 4.목록조회 5.종료 :AccountApp만들기
//계좌번호, 예금주, 잔액 :Account
//AccountExe : AccountApp 클래스의 인스턴스 호출 execute();

import java.util.Scanner;

import co.edu.Board;

public class AccountApp {

	Account[] accounts = new Account[100]; // 계좌정보 저장을 위한 배열

	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {
			System.out.println("1.계좌생성 2.계좌목록 3.입금 4.출금 5.종료");
			System.out.print("선택>>");
			int menu = 0;
			menu = scn.nextInt();

			if (menu == 1) {
				createAccount();
				scn.nextLine();
			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("end of program.");
	}

	// 계좌생성시 실행 메소드
	public void createAccount() {
		System.out.println("새로운 계좌를 만듭니다.");
		System.out.println("예금주 이름을 입력해주세요.");
		String nNm = scn.next();
		System.out.println("생성하고싶은 계좌번호 10자리를 입력하세요. ex)0-0000-00000");
		String nAcn = scn.next();
		System.out.println("초기입금액을 입력하세요.");
		int nCash = scn.nextInt();
		Account newacn = new Account(nNm, nAcn, nCash);
		System.out.println("생성한 계좌의 예금주는" + nNm + " 계좌번호는 " + nAcn + " 잔액은" + nCash + "입니다.");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = newacn;
				break;
			}
		}
		System.out.println("생성이 완료되었습니다.");

	}// 입금처리시 실행 메소드

	public void deposit() {
		System.out.println("계좌 입금을 실행합니다.");
		System.out.println("입금하실 계좌의 계좌번호를 입력해주세요.");
		String InAC = scn.next();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNu().equals(InAC)) {
				System.out.println("입력하신" + accounts[i].getAccountNu() + "계좌의 현재 잔액은" + accounts[i].getCash() + "입니다.");
				int money = accounts[i].getCash();
				System.out.println("입금할 금액을 입력하세요.");
				int inMoney = scn.nextInt();
				if (inMoney > 0) {
					money = money + inMoney;

				}
				accounts[i].setCash(money);
				System.out.println("입금 후 잔액은" + money + "입니다.");
			}
			break;
		}

	}// 출금 처리시 실행 메소드

	public void withdraw() {
		System.out.println("계좌 출금을 실행합니다.");
		System.out.println("출금하실 계좌의 계좌번호를 입력해주세요.");
		String outAC = scn.next();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNu().equals(outAC)) {
				System.out.println("입력하신" + accounts[i].getAccountNu() + "계좌의 현재 잔액은" + accounts[i].getCash() + "입니다.");
				int money = accounts[i].getCash();
				System.out.println("출금할 금액을 입력하세요.");
				int outMoney = scn.nextInt();
				if (outMoney > 0) {
					money = money - outMoney;

				}
				accounts[i].setCash(money);
				System.out.println("출금 후 잔액은" + money + "입니다.");
			}
			break;
		}

	}

	// 전체 목록 실행 메소드
	public void accountList() {
		System.out.println("===========================================================");
		System.out.println("                      계좌 조회                              ");
		System.out.println("===========================================================");

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null) {
				accounts[i].getInfo();

			}
		}

	}

	public Account[] AllaccountList() {
		return accounts;

	}

}
