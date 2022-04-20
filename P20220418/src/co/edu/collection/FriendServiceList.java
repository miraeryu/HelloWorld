package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 컬렉션 ArrayList
public class FriendServiceList implements FriendService {

	ArrayList <Friend> friends = new ArrayList(); // 컬렉션 선언. 자바기능 import
	Scanner sc = new Scanner(System.in);

	@Override
	public void addFriend(Friend friend) {

		friends.add(new Friend(friend.getName(),friend.getPhone(),friend.getGender()));
		System.out.println("성공적으로 완료되었습니다.");

	}

	@Override
	public void modFriend(Friend friend) {
		for (int i= 0; i<friends.size();i++) {
			if (friends.get(i).getName().equals(friend.getName())) {
				System.out.println("변경할 번호를 입력하세요. -을 포함하여 입력해주세요.");
				System.out.println("입력>>");
				String modPh = sc.next();
				friends.get(i).setPhone(modPh);
				System.out.println("성공적으로 완료되었습니다.");
			}
		}


	}

	@Override
	public void remFriend(String name) {
		for (int i = 0 ; i <friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				friends.remove(friends.get(i));
				System.out.println("성공적으로 삭제하였습니다.");
			}
		}

	}

	@Override
	public Friend fineFriend(String name) {// 친구 조회
		for (int i = 0; i < friends.size(); i++) {
//			Friend f2 = (Friend) friends.get(i);
//			if (f2.getName().equals(name)) {
			if (friends.get(i).getName().equals(name)) {//위와 아래 두가지 방법이 있음. 차이는 최상단 ArrayList를 Friend타입으로 정의했는가 아닌가의 차이
//			System.out.println(f2);
				System.out.println(friends.get(i));
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for (int i=0; i<friends.size();i++) {
			if(friends.get(i).getGender() == gender) {
				//열거형타입 클래스타입 같은 참조타입.
				//기본타입 == 비교연산자
				//열거형 == 비교연산자
				list.add(friends.get(i));
			}
		}
			
		return list;
	}
	
	

}
