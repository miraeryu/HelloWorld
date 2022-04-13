package co.edu.twodimension;

public class ArrayExamplet {
	public static void main(String[] args) {
		int intAry[][] = new int[6][6];
		
		intAry[1][1] = 1;
		intAry[2][1] = 2;
		intAry[3][1] = 3;
		intAry[4][1] = 4;
		intAry[5][1] = 5;
		
		intAry[1][2] = 6;
		intAry[2][2] = 7;
		intAry[3][2] = 8;
		intAry[4][2] = 9;
		intAry[5][2] = 10;
		
		intAry[1][3] = 11;
		intAry[2][3] = 12;
		intAry[3][3] = 13;
		intAry[4][3] = 14;
		intAry[5][3] = 15;
		
		intAry[1][4] = 16;
		intAry[2][4] = 17;
		intAry[3][4] = 18;
		intAry[4][4] = 19;
		intAry[5][4] = 20;
		
		intAry[1][5] = 21;
		intAry[2][5] = 22;
		intAry[3][5] = 23;
		intAry[4][5] = 24;
		intAry[5][5] = 25;
		
		//배열에서는 인덱스 주소값으로 값을 지정, 호출
		for(int i=1;i<6;i++) {
			for (int j=1; j<6; j++) { 
				System.out.printf("%3d",intAry[j][i]);
				if (j == 5) {
					System.out.println();
			}

			}

		}
	}

}
