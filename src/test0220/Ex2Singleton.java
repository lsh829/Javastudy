package test0220;
//Singleton 패턴 
//객체가 하나만 만들어지는 패턴
//1) 생성자를 private으로 만들기
//2) 객체를 생성하는 메소드는 class 메소드로 하나 만들어져야 한다.

//문제가 하나 있다!
//	멀티 쓰레드 환경에서는 객체가 2개 이상 만들어지는 경우를 내포하고 있다. 

public class Ex2Singleton {
	public static void main(String[] args) {
		//SingletonEx1 ob = new SingletonEx1(); //컴오류 . 
											    // 생성자가 private 
		
		SingletonEx1 ob1 = SingletonEx1.getInstance();
		SingletonEx1 ob2 = SingletonEx1.getInstance();
		
		System.out.println(ob1==ob2); //true
		ob1.print();
		
	}
}

class SingletonEx1 {
	// public 으로 안 고치고 외부에서 쓸 수 있도록
	private static SingletonEx1 inst;
	
	private SingletonEx1() {
		
	}
	
	// public 으로 안 고치고 외부에서 쓸 수 있도록
	public static SingletonEx1 getInstance() {
		if(inst==null) {
			inst = new SingletonEx1(); //1000번 getInstance()를 실행해도 한번만 실행된다. 
									   //Singleton패턴 - 객체가 하나만 생성되는 것, DB연동 시, 자주 쓰인다.
		}
		return inst;
	}
	
	
	public void print() {
		System.out.println("Singleton 패턴 예제 1...");
	}
}
