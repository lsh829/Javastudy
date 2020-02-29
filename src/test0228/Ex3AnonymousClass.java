package test0228;

public class Ex3AnonymousClass {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.fun();
		t.sub();
	}
}

interface User3 {
	public void print();
}

class Test3 {
	//인터페이스 구현 
	//Comparator처럼 즉흥적으로 그때 그때 메서드 구현을 달리하고자 할 때 사용
	public void fun() {
		User3 uu = new User3() {
			@Override
			public void print() {
				System.out.println("방가 방가...");
			}
		};
		uu.print();
	}
	
	public void sub() {
		User3 uu = new User3() {

			@Override
			public void print() {
				System.out.println("ㅎㅎㅎ.");
				
			}
		};
		uu.print();
	}
}