package co.edu.friend;

public class ComFriend extends Friend {

	private String company;
	private String department;

	// 생성자
	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}
	
	public ComFriend() {
		super();
	}

	// from superclass를 통해 부모클래스 생성자만 가능
//	public ComFriend(String name, String phone) {
//		super(name, phone);
//		// TODO Auto-generated constructor stub
//	}
//	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "회사친구 [이름=" +this.getName() + ", 전화번호="+super.getPhone()+", 회사명=" + company + ", 부서=" + department + "]";
	}//super.getName = this.getName 모두 가능

}
