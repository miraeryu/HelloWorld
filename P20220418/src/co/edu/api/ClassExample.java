package co.edu.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("java.lang.String");//클래스 자체에 대한 정보를 불러옴
			Method[] methods = cls.getDeclaredMethods();
			for (Method method: methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Class obj = ObjectExample.class;
		Constructor[] cons = obj.getDeclaredConstructors();
		for (Constructor construct : cons) {
			System.out.println(construct.getName());
		}
		
		
	}

}
