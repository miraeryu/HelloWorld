package co.edu;

public class Geme {
	public static void main(String[] args) {
		int[] problem = new int[5];

		for (int i = 0; i < 5; i++) {
			problem[i] = (int) (Math.random() * 5) + 1;
			for (int j = 0; j < i; j++) {
				if(problem[j] == problem[i]) {
					i--;
					break;
				}

			}
		}
		for(int x : problem) {
			System.out.println(x + "");
		}
		

		for (int i = 0; i < 5; i++) {
			problem[i] = i + 1;

		}
		for (int i = 0; i < 5; i++) {
			if (i == 4) {
				System.out.println("[" + problem[i] + "]");
			} else {
				System.out.println("[*]");
			}
		}

	}

}
