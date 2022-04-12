package co.edu.condition;

public class IfExample3 {
	public static void main(String[] args) {
		//중첩구문
		//90점이상 A 80점이상 B 70점이상 C 그 외 F
		//95점이상 A+ 85점이상 B+ 75점이상 C+
		int score = 76;
		
		if (score >= 90) {
			if (score >=95) {
				System.out.println("A+입니다.");
			} else {
				System.out.println("A입니다.");
			}
		}else if (score >= 80) {
			if(score >= 85) {
				System.out.println("B+입니다.");
			}else {
				System.out.println("B입니다.");
			}
		}else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+입니다.");
			}else {
				System.out.println("C입니다.");
			}
		}else {
			System.out.println("F입니다.");
		}
		
	}

}
