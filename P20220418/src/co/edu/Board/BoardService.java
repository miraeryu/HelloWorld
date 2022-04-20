package co.edu.Board;

public interface BoardService {
	
	public void addIndex(Board board);
	public void modify(int modNumber);
	public void remove(int remNumber);
	public void searchIndex(String writer);
	public void fullIndex(Board board);

}
