package test0220;

public class Ex5Interface {
	public static void main(String[] args) {
		//Demo5 ob = new Demo5(); //컴오류. interface는 객체생성 불가 - 추상클래스도 마찬가지
		Demo5 ob = new Test5(); //인터페이스 = 클래스 는 객체 생성 가능
								//업캐스팅 
		ob.print(); //메소드 재정의 시, 아버지의 메소드는 숨는다.
		//ob.sub(); //컴오류  //Demo에는 sub()가 없어서. //Demo5에 sub가 있니?
					
		//진짜는 Test5 니까 다운캐스팅을 하고 나서 부를 수 있다.
		((Test5)ob).sub(); //다운 캐스팅 
		
	}
}


// 선언만 있고 정의가 없는 추상클래스의 일종
interface Demo5 {
	public static final double PI = 3.14592;
	public int A = 10;	//static final 없어도 static final
	
	public abstract void print(); //메소드 시그너처와 상수 선언만을 포함 가능 
	void fun(); //public이 없어도 public,
				//abstract 이 없어도 abstract
				//컴파일러가 자기가 알아서 고쳐버린다.
}

//선언한 메소드를 만들어야 한다.
//인터페이스를 구현하는 클래스.
//인터페이스 안에 있는 메소드를 정의해줘야 한다.. 
class Test5 implements Demo5{
	int a = 10;
	//필드는 99% private이다.

	@Override
	public void print() {
		System.out.println("print...");
		
	}

	@Override
	public void fun() {
		System.out.println("fun...");
		
	}
	
	public void sub() {
		System.out.println("sub...");
	}
}
