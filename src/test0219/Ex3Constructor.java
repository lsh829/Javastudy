package test0219;

public class Ex3Constructor {
	public static void main(String[] args) {
		Test3 tt1 = new Test3();
		//Demo3 tt1 = new Demo3();이라는 명령이 생략 된 것?
			//1) new 연산자로 Demo3의 a아 Test3의 x 메모리 할당 및 0으로 초기화  (객체 생성 후 필드가 메모리를 할당받는다.)
			//2) Test3() 생성자의 첫줄을 실행 : this(100); => Test3(int x) 생성자 코드 
			//3) Test3(int x) 생성자의 첫줄을 실행  : super(); => Demo3() 생성자 코드 첫줄 실행 
			//4) Demo3() 생성자의 첫줄을 실행 : super(); => Object() 생성자 코드 실행  --> Object는 아버지가 없어서 super()가 없다. 
			//5) Demo3() 생성자 나머지 코드 실행
			//6) Test3(int x) 생성자 , 생성자 나머지 실행
			//7) Test3() 생성자 나머지 실행
			// (*****) 
			//생성자 안에는 기본적으로 아버지를 부린다. 아버지 생성자를 부르지 않은 하나가 있다. 
			//어떤 경우에라도 super()을 부른다. 
		tt1.write();
		
	}
}

class Demo3{
	int a = 10;
	
	public Demo3() { //얘가 생성자..?
		//super(); 숨어 있음 
		System.out.println("인자 없는 Demo3 생성자");
		a = 10;
	}
	
	public Demo3(int a) {
		System.out.println("인자 있는 Demo3 생성자");
		this.a = a;
	}
	
	public void print() {
		System.out.println("a:"+a);
		
	}
	
}

class Test3 extends Demo3 { //생성자 3개 
	int x;
	
	public Test3() { //아버지를 부를 수 없다. 다른 생성자는 딱 한번만 부를 수 있다. - 최상단만!
		this(100);  // 다른 생성자 호출. 최상단에서 한번만 가능
				    // 다른 생성자를 호출하지 않으면 super(); 로 상위 생성자 호출
		System.out.println("Test3 인자 없는 생성자");
	}
	
	public Test3(int x) {
		//super(); 가 숨어 있음.
		this.x = x; 
		System.out.println("Test3 인자 하나 있는 생성자");
	}
	
	public Test3(int a, int x) {
		super(a); //슈퍼 클래스의 생성자 호출. 최상단에서 한번만 가능 
		this.x = x;
		System.out.println("Test3 인자 둘 있는 생성자");
	}
	
	public void write() {
		System.out.println(a+":"+x);
		
	}
}
