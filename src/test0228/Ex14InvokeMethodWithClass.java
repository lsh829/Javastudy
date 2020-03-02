package test0228;

import java.lang.reflect.Method;

public class Ex14InvokeMethodWithClass {
	public static void main(String[] args) {
		String className = "test0228.User14"; //패키지명.클래스명  <<< 정확하게 지켜야함
		try {
			Class<?> cls = Class.forName(className);
			Object ob = cls.newInstance();
			//메서드 정의 
			Method m1 = cls.getDeclaredMethod("hap", new Class[] {Integer.class, Integer.class});
			Method m2 = cls.getDeclaredMethod("sub", new Class[] {int.class, int.class});
			Method m3 = cls.getDeclaredMethod("write", new Class[] {String.class, int.class});
			Method m4 = cls.getDeclaredMethod("print");
			
			//메소드 호출(기존 방법과 다르다) <= 프레임워크에서 호출할 때 사용하는 방법이다.
			Object o1 = m1.invoke(ob, new Object[] {20,10});
			//invoke : (사람들에게 어떤 감정. 행동을 촉발하기 위해 누구의 이름을) 부르다.
			//메서드를 해당 객체에서 호출한다.
			m3.invoke(ob, "합", o1); //합->30
			
			Object o2 = m2.invoke(ob, new Object[] {20,10});
			m3.invoke(ob, "차", o2); //차->10
			m4.invoke(ob); //print...
			
			//나중에 스프링 프레임 워크나 서블릿 등에서 객체를 생성하거나 메서드를 생성하는 방식은 위와 같이 진행된다. 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class User14 {
	public Integer hap(Integer a, Integer b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public void write(String title, int s) {
		System.out.println(title + "->" +s);
	}
	
	public void print() {
		System.out.println("print...");
	}
}
