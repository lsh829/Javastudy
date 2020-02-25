package test0220;

public class Ex7Interface2Implements {
	public static void main(String[] args) {
		User7 ob = new User7();
		Test7 tt = new User7(); //업캐스팅
		
		tt.write(); 
		((Demo7)tt).print(); //User7 클래스가 Demo7인터페이스고 구현되어 있으므로
							 //...?
		
		Demo7 dd = ob; // 업캐스팅 
		dd.print(); // print()가 Demo거라 접근 가능
		//dd가 write() 에 접근 하려면?
		((User7)dd).write();
	}
}


interface Demo7 {
	public void print();
}

interface Test7 {
	 public void write();
}

//두 개 이상의 인터페이스 구현가능
class User7 implements Demo7, Test7 {

	@Override
	public void write() {
		System.out.println("write...");
	}

	@Override
	public void print() {
		System.out.println("print...");
	}
	
}