package test0219;
// 검증이 끝난 타인이 만든 클래스를 물려받는 경우(상속받는 경우)
// Class 상속 
// Object -> Demo1 -> Test1
public class Ex1Inheritance {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d.b);
		//d.print(); //print()의 경우, Test1(자식)의 메소드 이기 때문에 쓸 수 없다.
					 //컴오류. 하위 클래스 메소드나 필드 접근 불가
		
		Test1 t = new Test1(); //t는 Test1의 객체  -- Demo의 객체도 만들어짐.
		t.write(); //Demo1(아버지)의 write()을 가져다가 쓸 수 있다.
		//System.out.println(t.a); //a는 private 이기 때문에 Demo1(아버지)이 상속이 안되도록 막아 둔 것이다.
		System.out.println(t.b+":"+t.c);
		
		t.print();
		
	}
}

class Demo1{
	private int a = 10;
	protected int b =20;
	public int c = 30;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
		//System.out.println(x); //컴오류 Test1(자식)의 x는 가져다가 쓸 수 없다.
							     //아버지껀 내꺼 내껀 내꺼!
	}
}

class Test1 extends Demo1 {
	int x =100;
	
	public void print() {
		System.out.println(x+":"+b+":"+c);
		//System.out.println(a); //컴오류
	}
	
	public void fun() {
		write();
	}
}