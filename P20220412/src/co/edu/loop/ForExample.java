package co.edu.loop;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=5; i++) { // 반복문. (초기화식; 조건식; 증감식)

			sum = sum + 3;
	
		}		
		System.out.println("sum : " + sum) ;
		
		for(int i = 1; i <=9; i++) {
			System.out.println("3 * " + i + "=" + (3 * i));
		}
		
		System.out.println("3*1=3");
		System.out.println("================================")
		;
		
		sum = 5 + sum;
		
		for(int i = 1; i <= 9; i++)
			System.out.println("5 * "+ i + "=" + (3 * i));
		System.out.println("================================");
		
		sum = 0;
		for(int i = 1; i <=9 ; i+=2) {
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println("================================");
		sum = 0;
		for(int i = 1; i <= 5; i++) {
			sum = sum + 2;
					System.out.println(sum);
		}
		 
	}

}
