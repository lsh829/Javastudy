package test0220;

public class Ex1final {
	public static void main(String[] args) {
		
	}

}

/*
final class Sam { //final 클래스 : 하위 클래스를 가질 수 없다. 
	int a; 
}


class Ex extends Sam { //컴오류
	
}
*/


class Demo1 {
	int a; 
	public final void print() { //하위 클래스에서 메소드 오버라이딩(재정의) 불가. 
		System.out.println(a);
	}
}

class Test1 extends Demo1{
	//public final void print() {} //컴오류  //하위 클래스에서 메소드 오버라이딩(재정의) 불가. 
	
	final int x; //컴오류 . 초기화가 안됐기 때문에. 
	final int y=10;//- final 변수는 반드시 한 번 초기화가 이루어져야함
				   // 인스턴스 final 변수는 선언시, 생성자 , 초기화 블럭에서 초기화 가능 
	
	//final 변수 보통 대문자로.
	static final int A;
	static final int B = 10;
		// static final 변수는 선언시 또는 static 초기화 블럭에서 초기화 해야한다. 
		// static final 변수는 생성자에서 초기화 불가 
	
	//static 블럭에서는 초기화 값을 줄 수 있다. 
	static { 
		A = 5; 
	}
	
	public Test1()  { //생성자에서 초기화 가능하다. 위에서 말했던 것과 같이 
		x = 5; 
		
	}
	
	public void write() {
		final int n=10; 
		//n=20; //컴오류. final 변수의 값은 한번만 설정할 수 있고, 변경이 불가하다. 
		//x=25; //컴오류 . final 변수는 값 변경 불가. 
		System.out.println(x+":"+y+":"+n);
	}
	
}