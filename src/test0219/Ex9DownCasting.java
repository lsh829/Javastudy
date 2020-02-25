package test0219;

public class Ex9DownCasting {
	public static void main(String[] args) {
		Demo9 dd1 = new Demo9();//진짜 얘는 Demo 객체
		System.out.println(dd1);//Demo@해쉬코드
		
	
		Demo9 dd2 = new Test9(); //업캐스팅 :  (*****) 언제나 가능
								//진짜 얘는 Test9 객체
								//Demo(아버지) - Test(자식)
								//Test9 dd = new Test9();
								//Demo aa = 
								
		System.out.println(dd2); //Test9@해쉬코드
		
		System.out.println(dd2.b);//20 Demo9의 필드 출력 - 자기 것이 우선순위이다
		dd2.print(); //오버라이딩된 하위 클래스 메소드 호출 --[다형성] 실행 시 결정 , 동적바인딩 
		 				//메소드의 경우는, 부모가 숨기기 때문에, 자기의 메소드가 실행된다.
		 				//메소드와 필드는 다르다.
		
		//dd2.sub(); //못불러요 //컴오류
		//int x = dd2.c; //컴오류
		
		//Test9의 b를 찍고 싶다.
		//int x  = (Test9)dd2.b; //컴오류
		int x = ((Test9)dd2).b;
		System.out.println(x);
		
		
		
		
		//Test9 tt = (Test9) dd1; //다운 캐스팅 //런타임 오류
								  // 다운 캐스딩은 업한 것만 가능하고 반드시 캐스팅 해야함
		
		Test9 tt = (Test9)dd2; //다운 캐스팅 
		System.out.println(tt.b);
		
		/*
		 * -- 객체 간의 캐스팅은 상하 관계에서 만 가능하다.
		 * -- 업 캐스팅은 언제나 가능한다.
		 * -- 다운 캣팅은 업 한 것만 가능하고 반드시, 캐스팅이 필요하다.
		 */
		
		//instanceof 는 dd1이 Test9의 객체이니? 라고 물어보는 것이다.
		System.out.println(dd1 instanceof Test9); //false
		System.out.println(dd2 instanceof Test9); //true --> 형변환이 가능하다
		
		
		if(dd2 instanceof Test9) { // 해당 클래스 객체이면 
			Test9 tt2 = (Test9) dd2;
			tt2.sub();
		}
	}				
}

class Demo9{
	int a = 10;
	int b = 20;
	
	public void print() { // 1)
		System.out.println(a+":"+b);
	}
}


class Test9 extends Demo9{
	int b = 200;
	int c = 300;
	
	public void print() { // 2)
		System.out.println(a+":"+b+":"+c); //10:200:300
	}
	
	public void sub() {
		System.out.println(a+":"+super.b+":"+c); //10:20:300
		super.print(); // 1) 번 호출
		//print(); // 2) 호출 
	}
}
