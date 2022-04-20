package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

public interface FriendService {
	
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int MEN = 5;
	public int WOMEN = 6;
	public int END = 7;
	
	//추가,수정,삭제,조회를 위한 기능 구현
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend fineFriend(String name);
	public ArrayList<Friend> findGender(Gender gender);

}
