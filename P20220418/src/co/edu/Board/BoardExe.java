package co.edu.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		BoardService newBoard = new BoardApp();
		ArrayList <Board> Board2 = new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("========================================================");
			System.out.println("                        게시판                            ");
			System.out.println("========================================================");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.글등록 2.글수정 3.글삭제 4.글상세조회 5.전체목록 6.종료");
			System.out.print("입력>>");
			int menu = sc.nextInt();
			System.out.println();
			if (menu == 1) {
				System.out.println("========================================================");
				System.out.println("                        글 등록                           ");
				System.out.println("========================================================");
				System.out.println("글 번호를 입력하세요.");
				System.out.print("입력>>");
				int number = sc.nextInt();
				System.out.println("제목을 입력하세요.");
				System.out.print("입력>>");
				String sbject = sc.next();
				System.out.println("내용을 입력하세요.");
				System.out.print("입력>>");
				String index = sc.next();
				System.out.println("작성자를 입력하세요.");
				System.out.print("입력>>");
				String writer = sc.next();
				System.out.println("작성일자를 입력하세요.");
				System.out.print("입력>>");
				int date = sc.nextInt();
				System.out.println();
				Board newindex = new Board(number,sbject,index,writer,date);
				newBoard.addIndex(newindex);
			}else if (menu ==2) {
				System.out.println("========================================================");
				System.out.println("                        글 수정                           ");
				System.out.println("========================================================");
				System.out.println("글 번호를 입력하세요.");
				System.out.print("입력>>");
				int number = sc.nextInt();
				newBoard.modify(number);
				System.out.println();
				
			}else if (menu ==3) {
				System.out.println("========================================================");
				System.out.println("                        글 삭제                           ");
				System.out.println("========================================================");
				System.out.println("글 번호를 입력하세요.");
				System.out.print("입력>>");
				int number = sc.nextInt();
				newBoard.remove(number);
				
				
			}else if (menu ==4) {
				System.out.println("========================================================");
				System.out.println("                        글 조회                           ");
				System.out.println("========================================================");
				System.out.println("작성자를 입력하세요.");
				System.out.print("입력>>");
				String writer = sc.next();
				newBoard.searchIndex(writer);
				
			}else if (menu ==5) {
				System.out.println("========================================================");
				System.out.println("                      게시글조회                           ");
				System.out.println("========================================================");
				newBoard.fullIndex(null);
			}else if (menu ==6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}

}
