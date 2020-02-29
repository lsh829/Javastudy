package test0228;

public class Ex7EnumtoStringOverride {
	public static void main(String[] args) {
		System.out.println(City.SEOUL); //서울인구는1000만 명입니다.
		
		//toString()이 재정의되어 있지 않으면 SEOUL이 출력된다.
		System.out.println("서울 인구:"+City.SEOUL); //서울 인구:서울인구는1000만 명입니다.
		
		System.out.println("\n전체 리스트...");
		for(City c : City.values()) {
			//나머지는 클래스 처럼 변수를 선언하고 getter와 같은 메서드를 선언하여 활용할 수 있겠구나!
			System.out.println(c.getName()+":"+c.getCount());
		}
	}
}

enum City {
	//상수에 값 할당 : 생성자를 작성해야 오류가 나지 않음.
	SEOUL("서울",1000), BUSAN("부산",350), DAEGU("대구", 250);
	
	private String name;
	private int count;
	
	//생성자는 private만 가능 (private 생략해도 private으로 선언된다.)
	private City(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return this.name+"인구는"+count+"만 명입니다.";
	}
}
