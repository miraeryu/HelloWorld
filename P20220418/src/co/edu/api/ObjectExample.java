package co.edu.api;

import java.util.HashSet;

class Member {
	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {//이름 중복값을 제외시키고 싶을때
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return this.name.equals(member.name);

		}
//		return super.equals(obj);
		return false;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}

public class ObjectExample {
	public static void main(String[] args) {

		// ArrayList = 컬렉션 : 인덱스 기준으로 요소를 구분 => 중복 저장 가능
		// Set (집합) : 요소의 값으로 구분 => 중복값은 받지 않음

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200); // 중복값을 처리하지 않기 때문에 삽입되지않음

		System.out.println(set.size());// 중복값은 제외해서 출력

		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동", 20));
		members.add(new Member("김길동", 22));
		members.add(new Member("홍길동", 20));

		System.out.println(members.size()); // 중복값을 제외시켜야하는데 3이나옴 이를 해결하기 위해서는 Member클래스의 hashcode = equals로 만들어야함
		System.out.println("홍길동".hashCode());
		System.out.println(new Member("홍길동",20).toString());
		
	}

}
