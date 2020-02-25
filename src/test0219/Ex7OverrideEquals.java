package test0219;
//오버라이딩을 이용한 성적 처리
public class Ex7OverrideEquals {
	public static void main(String[] args) {
		Demo7 dd1 = new Demo7();
		Demo7 dd2 = new Demo7();
		
		System.out.println(dd1.equals(dd2)); //주소 비교. false
					//Object 의 equals() 호출
		System.out.println(dd1);//클래스이름@해쉬코드
		System.out.println(dd1.toString());//클래스이름@해쉬코드
		
		
		Test7 tt1 = new Test7();
		Test7 tt2 = new Test7();
		System.out.println(tt1.equals(tt2));  // 1)
					//오버라이딩 전: 주소 비교. false
					// Test7에 재정의된 equals()를 호출
					//오버라이딩 후 : 값 비교. true
		System.out.println(tt1);
		System.out.println(tt1.toString());
		
	}
}

class Demo7{
	int a = 10;
	
	public void print() {
		System.out.println(a);
	}
}

class Test7{
	int a = 100;
	
	public void write() {
		System.out.println(a);
	}

	//값을 비교하여 true를 출력하기 위해 아버지의 equals를 오버라이딩(재정의) 해준다. 
	//마우스 우클릭 > source > Override..
	@Override
	public boolean equals(Object obj) {
		Test7 t = (Test7)obj;//obj는 1)의 tt2 
		return this.a == t.a; //this는 1)의 tt1 **this는 부른 곳을 말한다. 
		//return a == t.a;
	}

	@Override
	public String toString() {
		return "Test7 [a=" + a + "]";
	}
	
	
	
	
	
	
	
	
}