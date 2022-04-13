package co.edu.twodimension;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run =true;
		int studentNum = 0;
		int[] scores =null;
		Scanner scanner = new Scanner(System.in);
		
		while(run ) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1){//학생수입력
				System.out.print("학생 수>>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo == 2){//점수입력
				for(int i=0;i<scores.length;i++) {
					System.out.print("scores["+ i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				
			}
			else if(selectNo == 3){//점수리스트 조회
				for(int i=0; i<scores.length;i++) {
					System.out.println("scores["+ i + "]>" + scores[i]);
				}
				
			}
			else if(selectNo == 4){//분석
				int maxVal, sum;
				maxVal = sum = 0; //변수 초기화
				for (int i =0; i <scores.length; i++) {
					sum += scores[i];
					
					if (scores[i] > maxVal) {
						maxVal = scores[i];
					}
					
				}
				System.out.println("최고점수 : " + maxVal);
				System.out.printf("평균 점수 : %.2f", (double)(sum / scores.length));
				System.out.println();
				
			}
			else if(selectNo == 5){//종료
				run =false;
				
			}
			
		}
		System.out.println("프로그램 종료.");
	}

}
