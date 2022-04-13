package co.edu.twodimension;

public class ArrayExample2 {
	public static void main(String[] args) {
		//1반 3명 2반 4명 3반 2명
		int[][] scores = {{59,63,72}, {56,77,33,24}, {55,76}};
		System.out.println(scores[0][0]);
		System.out.println(scores[1].length); //반마다 배열의 크기 보는 방법
		
		
		
		System.out.println("--------------------");
		double avg = 0;
		for(int i=0;i<scores.length;i++) {
			int sum = 0; // 시작할때 sum으로 초기화
			for(int j=0;j<scores[i].length;j++) {
				System.out.println(scores[i][j]);
				sum += scores[i][j]; //for 안에서 돌아가기때문에 i값은 고정, j만 변경이 됨

		}
			avg = (double) sum / scores [i].length;
			System.out.println((i+1)+"번째 반의 합계: " +sum + ", 평균 : "+ avg); //i=0완료, i=1/i=2로 똑같은 방식 진행
		
		
		
		
		//학생들의 합계와 평균을 구하시오
		
	}

	}
}


