package test0228;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Ex11 이후 실습한 소스부터 엄청 어려울 수 있다~
//이런 것도 있구나 하고 넘어가면 됨.
//어쩔 수 없이 수업 진행
public class Ex11Reflect {
	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("java.lang.String");
			System.out.println("==========================");
			System.out.println("상위 클래스를 알아보자...");
			
			if(cls.getSuperclass() != null) {//모든 클래스의 super class는 Object 이니까 
											 //Object 클래스 외에 null갑이 나올 일은 없다.
				System.out.println(cls.getSuperclass().getName());
			}
			System.out.println("==========================");
			System.out.println("생성자를 알아보자...");
			Constructor<?>[] cc = cls.getConstructors();
			for(Constructor<?> c : cc) {
				//메서드 명이 좌르륵 출력된다.
				System.out.println(c);
			}
			System.out.println("==========================");
			System.out.println("필드 영역에 선언된 요소들을 알아보자.");
			Field[] ff = cls.getDeclaredFields();//private 까지 몽땅 출력
			//Field[] ff = cls.getFields(); //public만
			for(Field f: ff) {
				System.out.println(f);
			}
			System.out.println("===========================");
			System.out.println("선언된 메서드를 알아보자.");
			Method[] mm = cls.getDeclaredMethods();//private까지 포함
			//Method[] mm = cls.getMethods(); //public만
			for(Method m:mm) {
				System.out.println(m);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
