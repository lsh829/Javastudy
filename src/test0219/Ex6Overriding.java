package test0219;
//오버라이딩
public class Ex6Overriding{
	public static void main(String[] args) {
		Test6 ob = new Test6();
		ob.print();
	}
}

class Demo6 {
	int a = 10;
	public void print() { // 1)
		System.out.println(a);
	}
}


class Test6 extends Demo6{
	int x = 100;
	
	@Override //annotaion ..오버라이딩 (재정의)
	public void print() { // 2)
		System.out.println(a+":"+x);
	}
	
	public void fun() {
		print();// 2) 호출
		super.print(); // 1)호출  
		
	}
}
