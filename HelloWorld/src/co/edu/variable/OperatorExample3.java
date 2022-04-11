package co.edu.variable;

public class OperatorExample3 {
	public static void main(String[] args) {
		//영수증 물건의 가격과 현금
		//현금 10000원/물건가격7500원/부가세750원/잔돈2500원
		int cash, item, tax, charge;
		cash = 10000;
		item = 7500;
		tax = item*10/110;
		charge = cash - item;
		System.out.printf("영수증"
				+ "[현금]%5d"
				+ "[물건가격]%4d"
				+ "[부가세]%3d"
				+ "[거스름돈]%4d", cash, item, tax, charge);
	}

}
