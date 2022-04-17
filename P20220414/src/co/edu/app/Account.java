package co.edu.app;

public class Account {

	// 필드 : 계좌번호, 예금주, 잔액
	private String accountNu;
	private String name;
	private int cash = 0;

	// 생성자 :
	public Account(String accountNu, String name, int cash) {
		super();
		this.accountNu = accountNu;
		this.name = name;
		this.cash = cash;
	}

	// Getter,Setter
	public String getAccountNu() {
		return accountNu;
	}

	public void setAccountNu(String accountNu) {
		this.accountNu = accountNu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
	
	
	public void getInfo() {
		System.out.printf("예금주 : %3s , 계좌번호 : %12s, 잔액 : %7d 원 입니다. \n", this.name, this.accountNu, this.cash);
	}

}
