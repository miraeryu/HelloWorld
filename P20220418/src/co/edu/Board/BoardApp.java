package co.edu.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp implements BoardService{

	ArrayList <Board> newBoard = new ArrayList();
	Scanner sc=new Scanner(System.in);
	
	
	@Override
	public void addIndex(Board board) {
		newBoard.add(board);

		
		System.out.println("성공적으로 등록되었습니다.");
	}

	@Override
	public void modify(int modNumber) {
		for (int i = 0; i<newBoard.size();i++) {
			if (newBoard.get(i).getNumber() == modNumber) {
				System.out.println("수정할 제목을 입력해주세요.");
				System.out.print("입력>>");
				String modSubject = sc.next();
				System.out.println("수정할 내용을 입력해주세요.");
				System.out.print("입력>>");
				String modIndex = sc.next();
				newBoard.get(i).setSubject(modSubject);
				newBoard.get(i).setDetail(modIndex);
				System.out.println("수정을 완료하였습니다.");
		}
		
	}
	}
	@Override
	public void remove(int remNumber) {
		for (int i = 0 ; i<newBoard.size();i++) {
			if (newBoard.get(i).getNumber() == remNumber) {
				newBoard.remove(newBoard.get(i));
			}
		}
		
	}

	@Override
	public void searchIndex(String writer) {
		for (int i = 0; i <newBoard.size();i++) {
			if (newBoard.get(i).getWriter().equals(writer)) {
				System.out.println("--------------------------------------------------------");
				System.out.println(newBoard.get(i).toString());
				System.out.println("--------------------------------------------------------");
			}
		}System.out.println("조회 완료");
	}

	@Override
	public void fullIndex(Board board) {
		for(int i = 0; i<newBoard.size();i++) {
			System.out.println("--------------------------------------------------------");
			System.out.println(newBoard.get(i));
			System.out.println("--------------------------------------------------------");
			
		}System.out.println("조회 완료");
	}
	
	
	

}
