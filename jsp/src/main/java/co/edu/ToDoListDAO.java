package co.edu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToDoListDAO extends DAO{
	
	
	
	//리스트
	public List<TodoList> Todolist(){
		connect();
		List<TodoList> list = new ArrayList<>();
		String sql = "select * from to_do_list order by 3";
		
		try {
			psmt=conn.prepareStatement(sql);
			rs=psmt.executeQuery();
			while(rs.next()) {
				TodoList todo = new TodoList();
				
				todo.setStatus(rs.getString("status"));
				todo.setComplete(rs.getInt("complete"));
				todo.setNumber(rs.getInt("num"));
				
				list.add(todo);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return list;
		
	}
	
	
	//입력
	
	public void addList(String index) {
		connect();
		String sql = "insert into to_do_list values=(?,0,to_do_list_seq.nextval)";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, index);
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	
	
	//수정
	
	public void modifyList(String index, String exindex) {
		connect();
		String sql = "update to_do_list set status=? where status=?";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, index);
			psmt.setString(2, exindex);
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	
	//완료
	public void completeList(int number) {
		connect();
		String sql = "update to_do_list set complete=1 where num=?";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1, number);
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	
	
	//삭제
	
	public void deleteList(String index) {
		connect();
		String sql = "delete from to_do_list where status=?";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, index);
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
}
