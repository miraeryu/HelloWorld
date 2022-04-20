package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.friend.Friend;

class Orange {// 모든 클래스의 말미에는 extends Object가 생략되어있다

}

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.setField("Orange");
//		Object result = box.getField(); //리턴값이 오브젝트이기때문에
		String result = (String) box.getField(); // String 으로 결과값을 받고싶을 경우 형변환(캐스팅) 필수

		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		Integer result2 = box2.getField();

		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
//		list.add(10); //에러발생. 타입이 String이기때문
		list.add("김길동");

		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("박길동", "010-2222"));
		

//		Orange orange = (Orange) box.getField(); //모든 클래스의 제일 상위에는 Object 클래스가 있으므로 불가능
		System.out.println("end of program");
	}

}
