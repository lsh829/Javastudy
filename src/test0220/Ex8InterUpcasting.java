package test0220;

public class Ex8InterUpcasting {
	public static void main(String[] args) {
		//Demo8 ob =new Demo8(); //컴오류. 추상클래스 객체 생성 불가.
		Test8 ob = new User8(); //업캐스팅
		ob.print(); //print... //....?
		
	}
}

interface Test8 {
	public void print();
	public void write();
}

abstract class Demo8 implements Test8{ //abstract 없을 경우 write()까지 메소드 재정의 해줘야 하고, 대신 객체 생성 불가하다.
	public void print() {
		System.out.println("print...");
	}
}

class User8 extends Demo8{

	@Override
	public void write() {
		System.out.println("write...");
	}
	
}