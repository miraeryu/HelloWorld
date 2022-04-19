package co.edu.collection;

import co.edu.friend.Friend;

public interface FriendService {
	
	//추가,수정,삭제,조회를 위한 기능 구현
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend fineFriend(String name);

}
