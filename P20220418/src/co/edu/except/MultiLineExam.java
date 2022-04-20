package co.edu.except;

import java.util.Scanner;

public class MultiLineExam {
	public static void main(String[] args) {
//		String str = "오늘은 \n 날씨가 \n 좋군요\n";
//		str = "";
//		str += "오늘은 \n";
//		str += "날씨가 \n";
//		str += "좋구나!!!\n";
//		str += scn.nextLine();
//		
//		if(str.equals("")) {
//			break;	}
		
		Scanner scn = new Scanner(System.in);
		String str = "";
		while (true) {
			String temp = scn.nextLine();
			if (temp.equals("exit")) {
				break;
			}
			str += temp + "\n";
		}
		
		
		
		System.out.println(str.toString());
	}

}
