package test0228;

public class Ex2MemberClass {
	public static void main(String[] args) {
		//중첩 클래스는 외부에서 생성이 가능하니까 말 그대로 클래스가 겹친 "중첩" 클래스라고 부르는 것이로
		//내부 클래스(멤버 클래스)는 외부에서 직접적으로 생성이 불가능하므로 "멤버"클래스라고 부른다.
		//차이가 있다.
		//단, 내부 클래스는 감싼 클래스의 객체가 생성되어야만 외부에서 생성이 가능하므로 주의한다.
		
		//내부 클래스는 외부에서 단독으로 객체 생성이 불가능하다.
		//User2.Test2 tt = new User2.Test2(); //컴파일 오류
	
		//내부 클래스의 객체를 외부에서 생성하는 방법 
		User2 uu = new User2();
		User2.Test2 tt = uu.new Test2(); //만들 수 있어도 잘 사용하지 않는다.
		tt.write();
	}

}

class User2 {
	//내부 클래스 실습 (MemberClass)
	//중첩 클래스와 용어가 다르다. 중첩 클래스는 class 내부의 static class로 선언 된 것이도
	//내부 클래스는 class 내부의 일반 class로 선언된 것이다.
	//중첩 클래스는 User2 외부의 클래스에서 직접 객체 생성이 가능한 반명,
	//내부 클래스(Member Class)는 User2 외부에서는 Test2 클래스 객체를 직접적으로 생성하는 것은 불가능하다. 
	//다만 User2의 클래스의 객체를 먼저 생성한 뒤에 내부 클래스를 선언하는 것은 가능하다.
	//User2.Test2 tt = uu.new Test2(); //하지만 이러한 구문은 잘 사용하지 않는다.
	//내부 클래스의 목적 자체는 User2 내부에서 사용하기 위해 만들어진 클래스이다.
	
	int a = 10;
	static int b = 20;
	
	/*private*/ class Test2 { // 마찬가지로 private 으로 선언하면 Ex2등의 클래스에서 절대로 생성이 불가능하다.
		int x = 100;
		
		public void write() {
			System.out.println(a+":"+b+":"+x);
			print(); //가능하다 왜냐하면 이메서드 또한 Test2의 객체 메서드 이기 때문이다.
					 //Ex1과 비교하여 생각해보자.
			
		}
	}
	
	public void print() {
		System.out.println("print 메서드");
		System.out.println(a+":"+b);
	}
	
	public void fun() {
		Test2 oo = new Test2(); //User2 클래스의 메서드이니까 Test2의 객체를 생성할 수 있다.
		oo.write();
	}
}
