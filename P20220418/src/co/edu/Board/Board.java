package co.edu.Board;

public class Board {

	private int number;
	private String subject;
	private String detail;
	private String writer;
	private int date;

	public Board(int number, String subject, String detail, String writer, int date) {
		super();
		this.number = number;
		this.subject = subject;
		this.detail = detail;
		this.writer = writer;
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "게시글 번호 : " + number + "     작성자 : " + writer + "     작성일 : " + date + "\n제목 : " + subject + "\n내용\n"
				+ detail;
	}

}
