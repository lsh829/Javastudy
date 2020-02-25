package test0219;

public class Ex5Constructor3 {
	public static void main(String[] args) {
		Rect rr = new Rect(10,5);
		
		rr.rectArea();
		rr.rectlen();
		rr.write("사각형");
	}
	
}

class Test5 {
	protected double area;
	protected double len;
	
	public void write(String title) {
		System.out.println(title+"넓이: "+area+"둘레: "+len);
	}
}

//클래스 따로 만들어줘야 한다. - 관련성 있는 것들로만 구성해줘야 한다.

//원
class Circle extends Test5{
	private int r;
	
	/*
	
	//인자가 없는 객체 생성 가능
	public Circle() {
		
	}
	//인자가 있는 객체 생성 
	public Circle(int r) {
		this.r = r;
		
	}
	*/
	
	
	public void set(int r) {
		this.r = r;
	}
	
	public void circleArea() {
		area = r * r * Math.PI;
	}
	
	public void circleLen() {
		len = r *2 * Math.PI;
	}
}




//사각형 
class Rect extends Test5{
	private int width;
	private int height;
	//인자가 없는 객체 생성 가능
	public Rect() {
		
	}
	//인자가 있는 객체 생성 
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//넓이 메소드
	public void rectArea() {
		area = width*height;
	}
	
	//길이 메소드
	public void rectlen() {
		len = (width+height) *2;		
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}



