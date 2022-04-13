package co.edu.twodimension;

public class exam05 {
	public static void main(String[] args) {
		int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
		int sum = 0;
		double avg = 0.0;
		int cnt = 0; //기초값 지정이 필요한지 생각해볼것
		
		for(int i=0;i<array.length;i++) {

			for(int j=0;j < array[i].length;j++) {
				sum+=array[i][j];
				cnt++;
			}
		}
		avg =1.0* sum / cnt;
		
		
		
		System.out.println("sum: " +sum);
		System.out.println("avg: " +avg);
	}

}
