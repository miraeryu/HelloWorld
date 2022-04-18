package co.edu;

import co.edu.friend.Friend;

class Friend2 extends Friend{
	public Friend2() {
		super();
		this.getName();//protected
		this.getPhone(); // 접근불가 = default
	}

}
