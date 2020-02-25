package test0219;
//상위클래스에 인자있는 생성자가 있을 경우, 하위클래스의 생성자 작성 방법
public class Ex4Constructor2 {
	public static void main(String[] args) {
		//Demo4 dd = new Demo4(); // 컴오류
								// 인자가 없는 생성자 없음
								//인자가 있는 생성자 이기 때문에 인자가 없는 생성자는 안된다.
		Demo4 dd = new Demo4(5); 
		dd.print();
		
	}
}

class Demo4 {
	int a;
	
	public Demo4 (int a) {
		this.a = a;
		System.out.println("Demo4 인자 있는 생성자...");
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Test4 extends Demo4 { //아버지가 생성자가 있기 때문에.Test4에서 컴오류가 일어난다.
// 생성자를 만들지 않으면 오류 : 상위클래스가 인자 있는 생성자만 존재하므로 
	// 반드시 생성자를 만들고 super(값); 를 이용하여 반드시 상위클래스 생성자를 호출해야함.
	public Test4() { 
		super(10);
	
	}
	
}