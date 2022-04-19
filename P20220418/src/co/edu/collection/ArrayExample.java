package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.FriendList;

//배열과 컬렉션 차이
//배열활용한 프로그램, 컬렉션 활용 프로그램 구현
//인터페이스 선언 => 구현하는 클래스
public class ArrayExample {
	public static void main(String[] args) {
		//배열크기 변경 불가 vs 크기 
		//배열
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("홍길동","010-1111-1111");
		friendAry[1] = new Friend("김길동","010-1111-1112");
		friendAry[0] = null; //삭제시
//		friendAry[10] = null; //크기 초과시에도 오류가 남
		for(int i = 0; i <friendAry.length ; i++) { //출력시
			if(friendAry[i] !=null){
				System.out.println(friendAry[i].toString());
				//주로 null 포인트 오류가 발생하므로 if구절을 넣어줘야했음
				
			}
		}
		Friend f1 = friendAry[0];
		
		//컬렉션 활용. 인터페이스 => List:컬렉션 => ArrayList 활용
		ArrayList<Friend> friendList = new ArrayList<Friend>();//리스트 정의
		friendList.add(new Friend("박길동","010-3333"));//입력
		friendList.add(new Friend("최길동","010-4444"));
		friendList.remove(0); //삭제
		//배열은 삭제하면 그 공간만 삭제가 되고 변화가 없지만 컬렉션은 삭제하면 뒤에것이 앞으로 당겨짐
		
		for(int i = 0; i<friendList.size(); i++) {
			System.out.println(friendList.get(i));
		}
		Friend f2 = (Friend) friendList.get(0); //get(index) =>Object
		friendList.isEmpty();
	}
}
