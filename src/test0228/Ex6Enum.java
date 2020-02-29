package test0228;

public class Ex6Enum {
	public static void main(String[] args) {
		Test6 t =new Test6();
		//if(t.getColor()==1) {} 따위의 숫자 비교는 불가능하다.
		Color color = t.getColor();
		System.out.println(t); //test0228.Test6@4aa298b7
		
		switch (color) {
		case RED:
			System.out.println("red...."); //red....
			break;
		case GREEN:
			System.out.println("green....");
			break;
		case BLUE:
			System.out.println("blue....");
			break;
		}
		
		for(Color c : Color.values()) {
			//향상된 for문으로 Color 열거형 변수들을 모두 순회할 수 있음.
			System.out.println(c+"의 서수(기수):"+c.ordinal());
		}
	}
}

//열거형 변수 선언 
enum Color  {
	RED, GREEN, BLUE, BLACK, VIOLET, LIME ,ORANGE
}

class Test6{
	private Color color = Color.RED;
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}
