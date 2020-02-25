package test0219;
//Class상속 super
public class Ex2Super {
	public static void main(String[] args) {
		Test2 tt = new Test2();
		tt.print();
		
		System.out.println("main="+tt.a+":"+tt.b+":"+tt.c+":"+tt.d); //main=10:20:200:300
		//System.out.println(tt.super.c); //컴에러
										  // super, this 키워드는 class 내에서만 사용가능하다.
										  // main에서는 지금의 방법으로는 쓸 수 없다.
		
		System.out.println(((Demo2)tt).c); //30
										   //이러한 방법으로 부모의 c를 출력할 수 있다. 
	}
}

class Demo2 {
	int a = 10;
	int b = 20;
	int c = 30;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
}

class Test2 extends Demo2 {
	 int c = 200;
	 int d = 300;
	 
	 /*
	 public Test2() {
		 //Demo2(); //컴오류 - 생성자는 new 다음에만 쓸 수 있다. 
	 	 super(); //컴파일러가 알아서 아버지의 생성자를 만들어 준다.
	 }
	 */
	 
	 public void print() {
		int a = 1; //지역변수가 우선 , 메소드 안에 있는 a가 우선 
		
		System.out.println(a+":"+b+":"+c+":"+d); //10:20:200:300 
												 //아버지와 자식의 이름이 같을 경우, 자식의 우선순위가 높다.
		System.out.println(this.a+":"+this.b+":"+this.c+":"+this.d);//10:20:200:300 
																	//this는 객체 자기 자신이다.
		System.out.println(super.a+":"+super.b+":"+super.c+":"+this.d);//10:20:30:300
																	   //super는 아버지를 의미.
		System.out.println(super.a+":"+super.b+":"+super.c+":"+c);//10:20:30:200
	}
}