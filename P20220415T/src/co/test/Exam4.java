package co.test;

//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)
	//이름 중복가능 연락처 중복x
	
	private String name;
	private int birth;
	private String phone;
	
	
	
	public Exam4(String name, int birth, String phone) {
		super();
		this.name = name;
		this.birth = birth;
		this.phone = phone;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getBirth() {
		return birth;
	}



	public void setBirth(int birth) {
		this.birth = birth;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void getInfo() {
		System.out.printf("이름 : %4s \n생일 : %4d 전화번호 : %11s \n",this.name, this.birth,this.phone);
	}
	
	
	
	
	
}
