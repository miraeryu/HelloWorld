package co.edu.array;

public class ForExample {
	public static void main(String[] args) {
		// 주사위 2개 던지기
		//2개의 합 6이 되는 경우 
		int[] dice1 = {1,2,3,4,5,6};
		int[] dice2 = {1,2,3,4,5,6};
		
		for(int i=0;i<6;i++) {
			for(int j =0;j<6;j++) {
				if(i+j == 4) {
					System.out.println(dice1[i]+"," + dice2[j]);
				}
				 
			}
			
		}

				
		
	

	}

}
