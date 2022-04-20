package co.edu.nested;

import java.util.Scanner;

class Friend {
	String name;
	String phone;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
}
//중첩클래스, 중첩인터페이스

public class NestedApp {

	static Scanner sc = new Scanner(System.in);
	static Friend[] friends = new Friend[10];

	// 중첩인터페이스
	interface FriendService {
		int ADD = 1;
		int MOD = 2;
		int LIST = 3;
		
		
		void add();
		void modify();
		void list();
		

	}
	
	//중첩클래스
	static class FriendApp implements FriendService{

		@Override
		public void add() {
			System.out.println("이름>>");
			String name = sc.next();
			System.out.println("연락처>>");
			String phone = sc.next();
			System.out.println("나이>>");
			int age = sc.nextInt();
			
			Friend friend = new Friend();
			friend.setName(name);
			friend.setPhone(phone);
			friend.setAge(age);
			
			//배열 비어있는 위치에 저장
			for(int i = 0; i<friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					System.out.println(friends[i].toString());
					break;
				}
			}
			
		}

		@Override
		public void modify() {
			System.out.println("변경할 사람의 이름 입력>>");
			String name = sc.next();
			System.out.println("변경할 전화번호 입력>>");
			String phone = sc.next();
			
			for (int i = 0; i<friends.length; i++) {
				if (friends[i].getName().equals(name)) {
					friends[i].setPhone(phone);
					System.out.println(friends[i].toString());
					break;
				}
			}
			
			
		}

		@Override
		public void list() {
			for (int i = 0; i<friends.length; i++) {
				if(friends[i] != null) {
					System.out.println(friends[i].toString());

				}
			}
		}
		
	}
	public static void main(String[] args) {
		FriendApp app = new FriendApp();
		
		while (true) {
			System.out.println("==================");
			System.out.println("       연락처      ");
			System.out.println("==================");
			System.out.println("1.추가 2.수정 3.목록 4.종료");
			System.out.print("선택>>");
			int menu = sc.nextInt();
			if (menu == FriendService.ADD) {
				System.out.println("==================");
				System.out.println("     친구 추가      ");
				System.out.println("==================");
				app.add();
			}else if (menu == FriendService.MOD) {
				System.out.println("==================");
				System.out.println("     친구 수정      ");
				System.out.println("==================");
				app.modify();
			}else if (menu == FriendService.LIST) {
				System.out.println("==================");
				System.out.println("     친구 목록      ");
				System.out.println("==================");
				
				app.list();
			}else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}
		
	}
	
	
	

}
