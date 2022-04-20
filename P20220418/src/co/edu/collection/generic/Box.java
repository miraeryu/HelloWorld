package co.edu.collection.generic;

//public class Box {
//	Object field; //모든 형태 클래스의 제일 부모 클래스. 문자열/숫자/클래스 등 다양하게 받을 수 있음
//	
//	public void setField(Object field) {
//		this.field = field;
//		
//	}
//	
//	public Object getField() {
//		return field;
//	}
//
//}

public class Box <T>{ // T에 입력 타입으로 받겠다는 의미
	T field; //모든 형태 클래스의 제일 부모 클래스. 문자열/숫자/클래스 등 다양하게 받을 수 있음
	
	public void setField(T field) {
		this.field = field;
		
	}
	
	public T getField() {
		return field;
	}

}