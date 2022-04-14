package co.edu;

public class BoardList {
	private Board[] boards;

	// 배열 크기 초기화
	public void init(int size) {
		boards = new Board[size];

	}

	// 배열에 한건 입력
	public int addBoard(Board board) { // 타입뿐만이 아닌 클래스도 받아오기 가능
		//더 이상 공간이 없을때 = false
//		boolean check = false;
		int errorCase = -1; //저장공간없음
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1; //동일한 값이 있을 경우의 에러
				break; 
			}
			if (boards[i] == null) {
				boards[i] = board;
				errorCase = 0; //정상처리
				break;
			}
		}
		return errorCase;
	}

	// 수정 : 게시글번호 찾아서 내용, 제목 변경하도록
	public boolean modiftBoard(Board board) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
			}
		}
		return check;

	}

	// 삭제 : 게시글번호만 있으면 가능
	public boolean removeBoard(int bNo) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				boards[i] = null; // 배열 위치에 null대입
				check = true;
				break;
			}
		}
		return check;

	}

	// 한건조회 : 게시글번호
	public Board searchBoard(int bNo) { // 리턴타입은 void 입력 x
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				int currentCnt = boards[i].getSearchCnt(); //현재 조회수를 가지고옴
				boards[i].setSearchCnt(currentCnt + 1 );
				return boards[i];
			}
		}
		return null;

	}

	// 게시글 목록
	public Board[] boardList() {
		return boards;
	}

}
