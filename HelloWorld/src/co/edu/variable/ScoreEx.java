package co.edu.variable;

import java.util.Scanner;

public class ScoreEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score1, score2, score3, plusScore, bestScore;
		double avgScore;
		System.out.println("첫 번째 점수를 입력하시오.");
		score1 = scn.nextInt();
		System.out.println("두 번째 점수를 입력하시오.");
		score2 = scn.nextInt();
		System.out.println("세 번째 점수를 입력하시오.");
		score3 = scn.nextInt();
		plusScore = score1 + score2 + score3;
		avgScore = (score1 + score2 + score3)/3.0;
		
		// 최고점을 구하는 방식(score1, score2, score3 세가지 같이 비교)
		bestScore = 0;
		if(score1 > score2) {
			bestScore = score1;
		}else {
			bestScore = score2;
		}
		if (bestScore < score3) {
			bestScore = score3;
		}
		System.out.println("세 점수의 합은 " + plusScore + "이고 평균은 " + avgScore + " 최고점은 " + bestScore + "입니다.");
		
	}

}
