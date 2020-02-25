package test0219;
//Upcasting
public class Ex8Upcasting {
	public static void main(String[] args) {
		Test8 tt = new Test8();
		Demo8 dd = tt; // Demo8은 자식 때문에 메모리 할당됨
			// 상위클래스 객체가 하위 클래스 객체를 가르킴
			// 업 캐스팅 (up casting). 언제나 가능 
		
		System.out.println(tt.b + tt.c); // 부모와 자식에 동일한 변수가 있을 경우, 자식이 우선이다. (즉, 자기것이 우선이다.)
										 //200:300
		System.out.println(dd.b); //dd의 진짜는 Test이다. 
							  	  //Demo8을 new하지 않았기 때문이다.
								  //Demo8의 20이 나온다.
								  //dd의 진짜는 Test8이라며..?ㅜㅜ - 하지만 , dd는 자신의 Demo8의 b의 변수값인 '20'을 찾아간다. 
		
		dd.print();	// 윗 줄하고 동일하게 10:20 나와야 되는거 아냐...?ㅜㅜ
					// 자식의 10:200:300
		
		// 상위 클래스의 메소드를 하위 클래스에서 재정의하면
		//		상위 클래스의 메소드는 숨는다. 따라서
		//		상위 클래스의 객체가 하위 클래스의 객체를 가르키고 있으므로
		// 		메소드에서는 오버라이딩된 하위 클래스의 메소드가 호출된다.
		//		즉, 외부에서는 메소드가 오버라이딩된 경우 상위 클래스의 
		//		메소드는 부를 수 없다. 
		// 		하위 클래스 안에서는 super 키워드로 호출 가능하다.
		
					//오버라이딩 하면 아버지의 메소드는 숨는다.
					//ex)
					//원래 아버지는 강의실을 나한테 줬는데, 자식은 내것이 된 강의실을 pc방으로 만들었다.
					//아버지에게 추후 주신 강의실 좀 봐달라고 부탁.
					//아버지가 와서 직접 강의실을 보셨을 땐, pc방으로 보인다.
				
		
		//System.out.println(dd.c); //컴오류 
									//dd의 진짜는 Test , 동시에 Demo는 메모리할당 O
									//나한테 있나 없나만 확인.
									//실행 시에 결정 - 동적 바인딩 
									
									
		
	}
}

class Demo8 {
	int a = 10;
	int b =20;
	
	public void print() {
		System.out.println(a+":"+b);
	}
}

class Test8 extends Demo8{
	int b =200;
	int c =300;
	
	public void print() {
		System.out.println(a+":"+b+":"+c);
	}
	
	public void sub() {
		super.print();//상위 메소드 호출
		System.out.println(b+":"+c);
	}
}