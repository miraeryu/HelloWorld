package co.edu;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		// Boardlist에 정의해놓은 필드와 메소드를 활용해서 기능
		BoardList boardList = new BoardList();
		Scanner scn = new Scanner(System.in);
		boardList.init(5);

		while (true) {
			System.out.println("1.추가 2.수정 3.목록 4.삭제 5.한건조회 6.작성자조회 9.종료");
			System.out.printf("선택>>");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.println("글 번호를 입력하시오.");
				int bNo = Integer.parseInt(scn.nextLine());
//				상위항목과
//				int bNo = scn.nextInt();//도 같음

				System.out.println("제목을 입력하시오.");
				String bTitle = scn.nextLine();
				System.out.println("내용을 입력하시오.");
				String bContent = scn.nextLine();
				System.out.println("작성자를 입력하시오.");
				String bWriter = scn.nextLine();
				Board newBod = new Board(bNo, bTitle, bContent, bWriter); // 생성자 호출
				int chk = boardList.addBoard(newBod);
				if (chk == 0) {
					System.out.println("정상입력되었습니다.");
				} else if (chk == -1) {
					System.out.println("저장 공간이 없습니다.");
				}else if (chk == 1) {
					System.out.println("이미 있는 번호입니다.");
				}

			} else if (menu == 2) {
				System.out.print("수정할 글번호 입력>>");
				int bNo = Integer.parseInt(scn.nextLine());
				System.out.print("변경할 제목 입력>>");
				String title = scn.nextLine();
				System.out.print("변경할 내용 입력>>");
				String content = scn.nextLine();
				Board cBoard = new Board(bNo, title, content, null);

				if (boardList.modifyBoard(cBoard)) {// BoardList에 수정부분 참조
					System.out.println("정상적으로 수정되었습니다.");
				} else {
					System.out.println("수정이 비정상적으로 종료되었습니다.");
				}

			} else if (menu == 3) {

				Board[] boards = boardList.boardList();
				System.out.println("게시글번호   제목            내용             작성자  조회수");
				System.out.println("====================================================");
				for (Board board : boards) {
					if (board != null) {// board 값 중에 null이 있을수도 있기때문에
						board.getinfo();
					}
				}

			} else if (menu == 4) {
				System.out.print("삭제할 글번호>>>");
				int bNo = Integer.parseInt(scn.nextLine());
				if (boardList.removeBoard(bNo)) { // BoardList 삭제부분 호출
					System.out.println("정상적으로 삭제되었습니다.");
				} else {
					System.out.println("오류로 인해 삭제하지 못했습니다.");
				}

			} else if (menu == 5) {
				System.out.print("조회할 글번호>>>");
				int bNo = Integer.parseInt(scn.nextLine());

				Board getBoard = boardList.searchBoard(bNo);

				if (getBoard == null) { 
					System.out.println("조회결과가 없습니다.");
				} else {
					getBoard.getDetailInfo();}
			}else if (menu == 6) {
				System.out.println("작성자 이름을 입력하시오.");
				String sWriter = scn.next();
				Board[] getBoard = boardList.searchWriter(sWriter);
				
			}

			else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {

				System.out.println("정확한 메뉴를 선택하시오.");
			}
		}
		System.out.println("end of program.");
	}

}
