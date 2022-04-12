package co.edu.condition;

public class IfExample {
	public static void main(String[] args) {
		int score = 75;
		
		// 90점 이상 A, 80 이상 B, 70이상 C, 나머지 F
		if (score >= 90) {
			System.out.println("A학점입니다.");
		}else if (score >= 80) {
				System.out.println("B학점입니다.");
			}else if (score >= 70) {
					System.out.println("C학점입니다.");
				}else {
					System.out.println("F학점입니다.");
		}
		// if구분을 여러개 통해서도 만들 수 있음
		if (score >= 90) {
			System.out.println("A학점입니다.");
		}		
		if (score >= 80) {
			System.out.println("B학점입니다.");
		}
		if (score >= 70) {
			System.out.println("C학점입니다.");
		}
		if (score < 70) {
			System.out.println("F학점입니다.");
		}
		
	}

	}


