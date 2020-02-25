package test0219;

public class Ex10UpDownCasting {
	public static void main(String[] args) {
		//* 우변먼저 생각하자 
		Object ob1 = new String("서울"); //업캐스팅
		Object ob2 = new String("서울"); //업캐스팅
		
		//System.out.println("길이:"+ob1.length); //컴오류 //노트설명 기록 
		System.out.println(((String)ob1).length()); //다운 캐스팅으로 되돌려주면 length() 사용 가능
		
		System.out.println(ob1.equals(ob2)); //true
			//값비교. 메소드가 오버라이딩 되어 있음 ... (어디서?)
			//String의 equals()가 Object의 equals()를 '오버라이팅'하다. - 덮어썼다. 
			//메소드를 재정의하면 아버지의 메소드는 숨는다. 
	}
}
