package co.edu;

import co.edu.statics.Singleton;

public class SingletonEx {
	public static void main(String[] args) {
//		Singleton.get // 다른 패키지 내에서는 디폴트 수준의 지시(public X)로는 접근 불가능
		Singleton.getInstance(); //public으로 타입 선언시 다른 패키지임에도 불러올 수 있다.

	}
}
