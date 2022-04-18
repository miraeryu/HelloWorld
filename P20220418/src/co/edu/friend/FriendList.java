package co.edu.friend;

import java.util.Scanner;

public class FriendList {
	public static void main(String[] args) {
		
		final String val = "Hong";
		val = "hong2";

		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("홍길동","010-1111-2222","대구대학교","컴정"); //부모클래스 필드 1,2 자식클래스 필드 1,2 순차적 입력
//		friends[1] = new ComFriend("김길동","010-3456-7891","네이버","개발팀");
//		friends[2] = new Friend("박길동","010-4567-8912");

		Scanner scn = new Scanner(System.in);
		while (true) {
			Friend fri = null;
			System.out.println("=================================");
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			System.out.println("=================================");
			System.out.printf("입력>>");
			int menu = scn.nextInt();

			if (menu == 1) {// 친구등록
				System.out.println("친구를 등록합니다.");
				System.out.println("분류를 선택하세요.");
				System.out.println("=======================");
				System.out.println("1.친구 2.회사친구 3.학교친구");
				System.out.println("=======================");
				System.out.printf("입력>>");
				int add = scn.nextInt();

				// 공통부문은 if밖에두면 등록가능
				System.out.println("친구 이름을 입력하세요.");
				String newName = scn.next();
				System.out.println("친구 전화번호를 입력하세요. -까지 입력해야합니다.");
				String newPhone = scn.next();

				if (add == 1) {
					fri = new Friend(newName, newPhone);
				} else if (add == 2) {
					System.out.println("회사명을 입력하세요.");
					String newCom = scn.next();
					System.out.println("부서명을 입력하세요.");
					String newDep = scn.next();
					fri = new ComFriend(newName, newPhone, newCom, newDep);

				} else if (add == 3) {

					System.out.println("대학명을 입력하세요.");
					String newCom = scn.next();
					System.out.println("학과명을 입력하세요.");
					String newDep = scn.next();
					fri = new UnivFriend(newName, newPhone, newCom, newDep);
				}

				// 비어있는 위치 배열 저장
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = fri;
						break;
					}
					System.out.println("성공적으로 등혹하였습니다.");
				}
			}

			else if (menu == 2) {// 리스트
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println(friend.toString());
					}
				}

			} else if (menu == 3) {// 조회(이름)
				System.out.println("친구를 조회합니다.");

				System.out.println("이름을 입력하세요.");
				String serN = scn.next();
				for (Friend friend : friends) {
					if (friend.getName().equals(serN)) {
						System.out.println(friend.toString());
						break;
					}
				}

			} else if (menu == 4) {// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
}
