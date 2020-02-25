package test0220;

public class Ex11Anonyclass {
	public static void main(String[] args) {
		//Demo11 ob = new Demo11(); // 컴오류. 인터페이스는 객체 생성 불가
// ctrl+shift shift
 		//일회용 클래스
		//익명 클래스 :Ex11$1.class로 클래스가 생성
		Demo11 ob = new Demo11() { //anony... 클래스는 필요한데 이름없는 클래스
			
			@Override
			public void print() {
				System.out.println("익명 클래스로 구현됨,,");
			}
		}; //배열 일 때 세미콜론.
		
		ob.print();
	}
}

interface Demo11 {
	public void print();
	
}

// 구현된 클래스 딱 한번만 쓰고 말거다.
// 클래스 만들지 않고도 interface를 만들 수 있다.

