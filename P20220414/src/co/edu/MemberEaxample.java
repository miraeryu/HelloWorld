package co.edu;

import java.util.Scanner;

public class MemberEaxample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "사용자1", "010-2345-6789", 20);
//		m1.memberAge = 25; //초기값이 있으나 변경가능
		m1.setMemberAge(-25);
		m1.setMemberId("user01");
//		System.out.println("나이 " + m1.getMemberAge());
//		System.out.println("아이디 "+ m1.getMemberId());
//		m1.showInfo();
		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[2];

		// 사용자가 값을 입력
		for (int i = 0; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이 순으로 입력하시오.");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			String strAge = scn.next();
			int age = Integer.parseInt(strAge);
			Member newMember = new Member(id, name, phone, age);

			members[i] = newMember;

		}
		members[1].getMemberNm();

		// 1. 조회(이름) 2. 변경(아이디,연락처) 3.조회 (나이 많은 회원) 4.프로그램 종료

		while (true) {
			System.out.println("1.조회(이름) 2.변경(아이디,연락처) 3.조회(나이 많은 회원) 4.프로그램 종료");
			System.out.println("선택>>");
			int menu = scn.nextInt();
			scn.nextLine(); // 메뉴와 엔터키까지 처리하기위해

			if (menu == 1) {// 조회
				System.out.println("회원 이름을 입력하시오.");
				System.out.printf("입력>>");
				String entname = scn.next();
				for (Member member : members) {
					if (member.getMemberNm().equals(entname)) {
						member.showInfo();
					}

				}
				System.out.println("메인 메뉴로 돌아갑니다.");

			} else if (menu == 2) {// 변경
				System.out.println("정보를 변경한 회원 아이디을 입력하시오.");
				System.out.printf("입력>>");
				String entid = scn.next();
				for (int i = 0; i < members.length; i++) {
					if (entid.equals(members[i].getMemberId())) {
						System.out.println("현재 설정된 연락처는 " + members[i].getMemberPh() + "입니다.");
						System.out.println("변경할 연락처를 입력하시오.");
						System.out.printf("입력>>");
						String newph = scn.next();
						members[i].setMemberPh(newph); //set =>값을 바꿈 get은 읽기 전용
						System.out.println("성공적으로 변경하였습니다.");
						break;

					}
				}

			} else if (menu == 3) {
				System.out.println("나이 입력");
				int sAge = scn.nextInt();
				scn.nextLine();
				for(Member member : members) {
					if(member.getMemberAge() > sAge) {
						member.showInfo();
					}
				}
				

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				for (Member member : members) {
					member.showInfo();
				}
			}

		}

// 입력한 정보 출력

		System.out.println("end of program.");

	}

}
