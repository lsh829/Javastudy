package test0228;

public class Ex1StaticNestedClass {
	public static void main(String[] args) {
		//static 중첩 클래스 실습
		//User1의 객체를 생성할 필요 없이 바로 User1 안에 있는 중첩 클래스인 Test1 클래스의 객체를 생성하였다.
		//즉, 외부에서 중첩 클래스의 객체를 생성하는데 아무런 지장이 없다.
		
		User1.Test1 tt = new User1.Test1();
		tt.write();
		tt.sub(); //Test1은 User1 클래스 내부에 있지만 Test1 클래스 내 메서드에서 User1의 객체를 생성할 수 있다.
	}
}

class User1 {
	int a = 10; //객체가 생성되기 전까지(new~)는 메모리에 할당되지 않는다는 점을 기억하자
	static int b = 20;
	
	/*private*/ static class Test1 { //private 접근제한자를 설정하면 User1 클래스 내부에서만 사용할 수 있다.
		//즉,private 접근제한자를 설정하면 Ex1클래스 등의 외부 클래스에서는 절대 Test1 클래스에 접근이 불가능하다.
		//NestedClass(중첩 클래스)
		//중첩 클래스는 클래스 안에 또 작성하는 것이라고 생각하면 됩니다.
		//static class인 Test1은 User1클래스의 객체가 생성되지 않아도 Test1의 객체를 단독으로 생성할 수 있음.
		int x = 100;
		
		public void write() {
			System.out.println(x);
			//System.out.println(a); //컴파일 오류 : User1의 객체를 생성한 후에, 호출할 수 있다.
			//print(); // User1의 객체를 생성한 후에 호출할 수 있따,
			System.out.println(b);
		}
		
		public void sub() {//내부 클래스 //XX--Test1이 내부클래스라는 의미일까요??ㅜㅜ
			User1 uu = new User1(); 
			System.out.println(uu.a);//객체가 생성되었으므로 User1 uu는 a변수를 가질 수 있음.
			uu.print();//가능 : uu는 User1의 객체의 주솟값을 담고 있다. 따라서 uu가 가리키는 곳은 객체이다.
		}	
	}
	
	public void print() {
		System.out.println(a+":"+b);
	}
	
	public static void fun() {
		//System.out.println(a); //컴파일 오류 : 왜냐하면 필드의 a변수는 인스턴스(객체를 생성한 후 사용할 수 있는 ) 변수이다.
		//static은 메모리할당이 스택 영역이지만 객체는 힙 영역에 저장이 되기 때문에 저장공간이 달라서
		//a 객체 변수를 static이 활용할 수 없다고 생각하면 됩니다.
		//(그리고 a객체는 언제 생성될지 static이 알 수 없음 . 생성된 줄도 모름)
		//다만, 객체는 static의 변수를 활용할 수 있습니다.
		//(객체 생성 이전에 클래스를 로드하고 static 영역을 미리 불러올 테니까)
		System.out.println(b);
	}
	
	
}
