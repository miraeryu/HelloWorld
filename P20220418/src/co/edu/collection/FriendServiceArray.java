package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

//배열의 기능 활용

public class FriendServiceArray implements FriendService{
Friend[] friends = new Friend[10];
Scanner sc = new Scanner(System.in);
	@Override
	public void addFriend(Friend friend) {
		System.out.println("===================");
		System.out.println("      친구 추가      ");
		System.out.println("===================");
		System.out.println("친구 이름을 입력하세요.");
		System.out.print("입력>>");
		String addName = sc.next();
		System.out.println("친구의 전화번호를 입력하세요. -을 포함하여 입력해주세요.");
		System.out.print("입력>>");
		String addPhone = sc.next();
		Friend newFriend = new Friend(addName,addPhone);
		for (int i= 0; i<friends.length; i++) {
			if (friends[i] ==null) {
				friends[i] = newFriend;
				break;
			}
		}
		System.out.println("등록 완료");
	}

	@Override
	public void modFriend(Friend friend) {
		System.out.println("===================");
		System.out.println("      친구 수정      ");
		System.out.println("===================");
		System.out.println("친구 이름을 입력하세요.");
		System.out.print("입력>>");
		String modName = sc.next();
		for (int i = 0; i<friends.length;i++) {
			if (friends[i].getName().equals(modName)) {
				System.out.println("현재 연락처는 " +friends[i].getPhone()+" 입니다.");
				System.out.println("바꿀 연락처를 입력하세요.");
				String modPh = sc.next();
				friends[i].setPhone(modPh);
				break;
			}
		}System.out.println("수정 완료");
		
	}

	@Override
	public void remFriend(String name) {
		System.out.println("===================");
		System.out.println("      친구 삭제      ");
		System.out.println("===================");
		System.out.println("친구 이름을 입력하세요.");
		System.out.print("입력>>");
		String remName = sc.next();
		for (int i=0; i<friends.length;i++) {
			if (friends[i].getName().equals(remName)) {
				friends[i]= null;
				break;
			}
		}System.out.println("삭제 완료");
		
	}

	@Override
	public Friend fineFriend(String name) {
		System.out.println("===================");
		System.out.println("      친구 조회      ");
		System.out.println("===================");
		for (int i= 0; i<friends.length;i++) {
			if(friends[i] != null) {
			System.out.println(friends[i].toString());
			
			
			}
		}System.out.println("메뉴로 돌아갑니다.");
		return null;
	}

}
