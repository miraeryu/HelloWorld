package co.edu.friend;

public class UnivFriend extends Friend{
	
	
	private String univ;
	private String major;
	
	
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone); //매개변수를 받는 생성자 호출
		this.univ = univ;
		this.major = major;
	}



	public String getUniv() {
		return univ;
	}



	public void setUniv(String univ) {
		this.univ = univ;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}



	@Override
	public String toString() {
		return "대학친구 [이름="+this.getName()+", 전화번호"+this.getPhone()+", 학교명=" + univ + ", 전공=" + major + "]";
	}
	

}
