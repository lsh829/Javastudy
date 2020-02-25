package test0220;

public class Ex6Interface {
	public static void main(String[] args) {
		Apple a = new Apple(); //객체 생성
		packing(a);
		
		Orange o = new Orange();
		packing(o);
	}
	
	//인터페이스 -> 표준화
	public static void packing(Fruit f) { //Fruit 한테 의존관계를 가짐. 
		System.out.println(f.getName()+":"+f.getPrice());
	}
	
	//인터페이스 안 썼을 경우
	/*
	 * 
	 public static void packing(Apple f) {
		System.out.println(f.getName()+":"+f.getPrice());
	}
	
	public static void packing(Orange f) {
		System.out.println(f.getName()+":"+f.getPrice());
	}
	
	**만약 수정할 경우가 생기면 하나씩 수정해줘야하는데 , 인터페이스를 쓰면, 한번에 수정해주면 된다.
	 */
}

interface Fruit {
	public int getPrice(); //가격
	public String getName(); //과일이름
}

class Apple implements Fruit {

	@Override
	public int getPrice() {
		
		return 1000;
	}

	@Override
	public String getName() {
		
		return "사과";
	}
	
}

class Orange implements Fruit {

	@Override
	public int getPrice() {
		return 500;
	}

	@Override
	public String getName() {
		return "오렌지";
	}
	
}


