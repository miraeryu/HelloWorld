package co.edu.condition;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("벤치프레스를 입력하세요.");
		int b = scn.nextInt();
		System.out.println("데드리프트를 입력하세요.");
		int d = scn.nextInt();
		System.out.println("스쿼트를 입력하세요.");
		int s = scn.nextInt();
		
		boolean sum = b + d + s >=500;
				System.out.println("총 합이 500kg보다 큽니까?" + sum);
	}

}
