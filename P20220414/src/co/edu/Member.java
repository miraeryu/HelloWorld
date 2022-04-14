package co.edu;

public class Member {
	public static String Mname;
	// 필드에 회원 아이디, 회원이름, 회원 연락처, 회원나이
	private String memberId; // private 입력시 데이터를 숨길 수 있음.
	private String memberNm;
	private String memberPh;
	private int memberAge; // -값은 불가능

	// 생성자
	public Member(String memberId, String memberNm, String memberPh, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberNm = memberNm;
		this.memberPh = memberPh;
		this.memberAge = memberAge;
	}

	// 메소드
	void setMemberId(String memberId) {
		this.memberId = memberId;
		
	}
	String getMemberId() {
		return memberId;
	}

	void setMemberAge(int age) {
		if (age < 0) {// 최소값 지정
			memberAge = 10;
		} else {
			memberAge = age;

		}

	}

	public String getMemberNm() {
		return memberNm;
	}

	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}

	public String getMemberPh() {
		return memberPh;
	}

	public void setMemberPh(String memberPh) {
		this.memberPh = memberPh;
	}

	int getMemberAge() {
		return memberAge; // 리턴타입과 같은 변수로 지정
	}

	void showInfo() {
		System.out.printf("회원 이름은 %4s \n 연락처 %13s\n 나이 %2s\n", memberNm, memberPh, memberAge);
	}

}
