package co.test;

import java.util.Scanner;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.

//수정 : 이름을 찾아 전화번호를 바꿈
//삭제 : null값 넣어주기

public class Exam5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Exam4[] friends = new Exam4[100];

		while (true) {
			System.out.println("1.추가 2.수정 3.삭제(이름) 4.조회(이름) 5.종료");
			System.out.println("선택>>");
			int menu = 0;
			menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("=================");
				System.out.println("     친구 추가     ");
				System.out.println("=================");
				System.out.println("추가할 친구의 이름을 입력하세요.");
				String newName = scn.next();
				System.out.println("추가할 친구의 생일을 입력하세요. 월과 일만 입력하면 됩니다. ex)0405");
				int newBirth = scn.nextInt();
				System.out.println("추가할 친구의 전화번호를 입력해주세요. -은 제외하고 입력하면 됩니다.");
				String newPhone = scn.next();
				Exam4 newFriend = new Exam4(newName, newBirth, newPhone);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = newFriend;
						break;
					}
				}
				System.out.println("등록 완료");

			} else if (menu == 2) {
				System.out.println("=================");
				System.out.println("     친구 수정     ");
				System.out.println("=================");

			} else if (menu == 3) {
				System.out.println("=================");
				System.out.println("     친구 삭제     ");
				System.out.println("=================");

			} else if (menu == 4) {
				System.out.println("=================");
				System.out.println("     친구 조회     ");
				System.out.println("=================");
				System.out.println("찾는 친구의 이름을 입력하시오.");
				String searchName = scn.next();
				for (int i = 0; i < friends.length; i++) {
					if(friends[i].getName().equals(searchName)) {
						friends[i].getInfo();
					}else {
						System.out.println("올바른 이름이 아닙니다.");
					}

				}

			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}
		System.out.println("end of prog.");
	}
	

	public Exam4[] friendList() {
		return friends;
	}

}
