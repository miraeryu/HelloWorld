package co.edu.twodimension;

public class ArrayExample {
	private void maian() {
		// TODO Auto-generated method stub
		int[][] intAry = new int[4][3];
		
		intAry[0][0] = 10;
		intAry[1][0] = 20;
		intAry[3][2] = 100;
		
		for(int j=0; j<intAry.length; j++)
		for(int i=0; i < intAry[j].length ; i++) {
			System.out.println("["+j+"]"+"["+i+"] -> "+intAry[i]);
			
		}
		System.out.println(
				
		);

	}

}
