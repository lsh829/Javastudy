package test0220;

//JDK 8 이상
public class Ex9Extends {
	public static void main(String[] args) {
		
	}
}

interface ADemo9 {
	public void write();
}

interface BDemo9 {
	public void print();
}


//인터페이스는 다른 인터페이스를 2개 이상 상속 가능 
interface Demo9 extends ADemo9, BDemo9 { //Class는 단일 상속만 가능 
	public void sub();
}

class User9 implements Demo9 {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}
