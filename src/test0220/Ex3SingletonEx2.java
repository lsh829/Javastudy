package test0220;
//문제가 하나 있다!
//멀티 쓰레드 환경에서는 객체가 2개 이상 만들어지는 경우를 내포하고 있다.

//해당 문제를 해결하려고 고친 프로그램 

public class Ex3SingletonEx2 {
	public static void main(String[] args) {
		SingletonEx2 ob1 = SingletonEx2.getInstance();
		SingletonEx2 ob2 = SingletonEx2.getInstance();
		
		System.out.println(ob1);
		System.out.println(ob2);
		
	}
}

class SingletonEx2 {
	private SingletonEx2() {
		
	}
	
	// static 중첩 클래스 -- 클래스 안에 클래스가 또 있다. 
	private static class Holder{
		public static final SingletonEx2 INST = new SingletonEx2(); //아무리 멀티스레드 환경이여도, 한 번 밖에 실행하지 않는다.
	}
	
	public static SingletonEx2 getInstance() {
		return Holder.INST;
	}
}