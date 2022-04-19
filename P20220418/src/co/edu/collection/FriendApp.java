package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;

//친구목록 저장을 위한 App
//추가, 수정, 삭제, 조회 기능 //이름으로 구현
//1)배열 2)컬렉션 <= 인터페이스를 구현하는 구현클래스로 만들어야함
public class FriendApp {
	public static void main(String[] args) {
//		FriendService service = new FriendServiceArray(); //배열
		FriendService service = new FriendServiceList(); // 컬렉션
		Scanner sc = new Scanner(System.in);
		// 추가, 수정, 삭제, 조회 =>컨트롤 역할
		ArrayList friends = new ArrayList();
//		Friend[] friends = new Friend[10];
//		service.addFriend(null);
//		service.modFriend(null);

		while (true) {
			System.out.println("===================");
			System.out.println("        연락처       ");
			System.out.println("===================");
			System.out.println("원하는 기능을 입력해주세요.");
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.종료");
			System.out.print("선택>>>");
			int menu = 0;
			menu = sc.nextInt();
			System.out.println();
			if (menu == 1) {
				service.addFriend(null);

			} else if (menu == 2) {
				service.modFriend(null);

			} else if (menu == 3) {
				service.remFriend(null);

			} else if (menu == 4) {
				service.fineFriend(null);

			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 선택입니다.");
				System.out.println("메인메뉴로 돌아갑니다.");
			}
		}

	}
}
