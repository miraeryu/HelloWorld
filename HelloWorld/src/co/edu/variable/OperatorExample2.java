package co.edu.variable;

public class OperatorExample2 {
	public static void main(String[] args) {
		//오렌지 127개 
		//10개씩 담을 수 있는 상자, 5개씩 담을 수 있는 상자
		int orange, set10, set5, others;
		orange = 127;
		set10 = 127/10;
		set5 = (127%10)/5;
		others = ((127%10)%5);
		System.out.printf("%3d개의 오렌지를 10개입 상자에 %2d상자, 5개입 상자에 %1d상자 담고 %1d개가 남았습니다.", orange, set10, set5, others);
	}
	
}