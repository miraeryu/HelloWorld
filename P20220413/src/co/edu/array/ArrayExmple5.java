package co.edu.array;

import java.util.Scanner;

public class ArrayExmple5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] scores = new int[5];
		int max = 0;
		int min = 100;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("학생 점수를 입력하세요.");
			scores[i] = scn.nextInt();
			if (max < scores[i]) {
				max = scores[i];
			}
			if (min > scores[i]) {
				min = scores[i];
			}
		}

		System.out.println("학생 중 최고점은 " + max + ", 최저점은 " + min + " 입니다.");

		// 학생 중 최고점, 최저점.
		
		
	
		
		
	}

}

