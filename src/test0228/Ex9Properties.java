package test0228;

import java.util.Enumeration;
import java.util.Properties;

public class Ex9Properties {
	public static void main(String[] args) {
		String s; 
		//getProperty 의 키값은 대소문자 구분함.
		s = System.getProperty("os.name");
		System.out.println("OS:"+s);
		
		s = System.getProperty("java.version");
		System.out.println("자바 버전:"+s);
		
		s = System.getProperty("user.dir");
		System.out.println("현재 작업 경로:"+s);
		
		System.out.println("=======================");
		
		//getProperty 에 입력하는 Key값과 Key에 대응하는 값(Value)을 모두 출력하는 방법
		//반복자의 종류 : Iterator, ListIterator (앞 뒤 양방향 이동이 가능함), Enumeration
		Properties p = System.getProperties();
		Enumeration<?> e = p.propertyNames();
		while(e.hasMoreElements()) {// Iterator랑 메서드명이 다르지 원리는 비슷하다고 생각하자.
			String k = (String)e.nextElement();
			String v = p.getProperty(k);
			System.out.println(k+"==>"+v);
		}
		
		//프로그램 강제 종료
		System.out.println("프로그램 강제 종료");
		System.exit(0);
	}
}
