package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//친구목록 저장을 위한 App
//추가, 수정, 삭제, 조회 기능 //이름으로 구현
//1)배열 2)컬렉션 <= 인터페이스를 구현하는 구현클래스로 만들어야함
public class FriendApp {
	public static void main(String[] args) {
//		FriendService service = new FriendServiceArray(); //배열
		FriendService service = new FriendServiceList(); // 컬렉션
		Scanner sc = new Scanner(System.in);
		// 추가, 수정, 삭제, 조회 =>컨트롤 역할
//		Friend[] friends = new Friend[10];
		ArrayList friends = new ArrayList();
//		service.addFriend(null);
//		service.modFriend(null);

		while (true) {
			System.out.println("===================");
			System.out.println("        연락처       ");
			System.out.println("===================");
			System.out.println("원하는 기능을 입력해주세요.");
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.남자 6.여자 7.종료");
			System.out.print("선택>>>");
			int menu = 0;
			menu = sc.nextInt();
			System.out.println();
			if (menu == 1) {
				System.out.println("===================");
				System.out.println("      친구 추가      ");
				System.out.println("===================");
				System.out.println("친구 이름을 입력하세요.");
				System.out.print("입력>>");
				String addName = sc.next();
				System.out.println("친구의 전화번호를 입력하세요. -을 포함하여 입력해주세요.");
				System.out.print("입력>>");
				String addPhone = sc.next();
				System.out.println("성별을 입력하세요. 남/여");
				String addSex = sc.next();
				Gender gen = Gender.MEN;
				if (addSex.startsWith("남")) {
					gen = Gender.MEN;
				} else if (addSex.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(addName, addPhone, gen);
				service.addFriend(friend);

			} else if (menu == 2) {
				System.out.println("===================");
				System.out.println("      친구 수정      ");
				System.out.println("===================");
				System.out.println("친구 이름을 입력하세요.");
				System.out.print("입력>>");
				String serName = sc.next();
				Friend serFriend = new Friend(serName, null);
				service.modFriend(serFriend);

			} else if (menu == 3) {
				System.out.println("===================");
				System.out.println("      친구 삭제      ");
				System.out.println("===================");
				System.out.println("친구 이름을 입력하세요.");
				System.out.print("입력>>");
				String remName = sc.next();
				service.remFriend(remName);

			} else if (menu == 4) {
				System.out.println("===================");
				System.out.println("      친구 조회      ");
				System.out.println("===================");
				System.out.println("친구 이름을 입력하세요.");
				System.out.print("입력>>");
				String serName = sc.next();
				service.fineFriend(serName);

			} else if (menu == FriendService.MEN) {
				ArrayList<Friend> list =service.findGender(Gender.MEN);
				for (Friend friend : list){
					System.out.println(friend.toString());
				}

			} else if (menu == FriendService.WOMEN) {
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for (Friend friend : list){
					System.out.println(friend.toString());
				}
				

			} else if (menu == 7) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 선택입니다.");
				System.out.println("메인메뉴로 돌아갑니다.");
			}
		}

	}
}
