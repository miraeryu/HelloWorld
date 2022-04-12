package co.edu.loop;

public class DiceExample {
	public static void main(String[] args) {
		int dice, dice2, sumdice ;
		boolean twodice = true;
		while(twodice) {
			dice = (int) (Math.random()*6)+1 ;
			dice2 = (int) (Math.random()*6)+1 ;
			System.out.println("(" + dice + "," + dice2 + ")");
			sumdice = dice + dice2;
			if (sumdice != 5 ){
				System.out.println("나온 주사위의 값은" + dice + ", " + dice2 + "으로 합은 " + sumdice);
				System.out.println("주사위를 다시 돌립니다.");

	}else {
		System.out.println("나온 주사위의 값은" + dice + ", " + dice2 + "으로 합은 " + sumdice);
		System.out.println("프로그램을 종료합니다.");
		break;
		}
	

}
	}
}
