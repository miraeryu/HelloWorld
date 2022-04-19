package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;

// 컬렉션 ArrayList
public class FriendServiceList implements FriendService {

	ArrayList friends = new ArrayList(); // 컬렉션 선언. 자바기능 import
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
		friends.add(new Friend(addName, addPhone));
		System.out.println("성공적으로 완료되었습니다.");

	}

	@Override
	public void modFriend(Friend friend) {
		System.out.println("===================");
		System.out.println("      친구 수정      ");
		System.out.println("===================");
		System.out.println("친구 이름을 입력하세요.");
		System.out.print("입력>>");
		String serName = sc.next();

	}

	@Override
	public void remFriend(String name) {
		System.out.println("===================");
		System.out.println("      친구 삭제      ");
		System.out.println("===================");
		System.out.println("친구 이름을 입력하세요.");
		System.out.print("입력>>");
		String remName = sc.next();
		friends.remove(remName);;

	}

	@Override
	public Friend fineFriend(String name) {// 친구 조회
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
		return null;
	}

}
