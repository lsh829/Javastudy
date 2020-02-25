package test0221;

public class Ex10ExceptionAfter {
	public static void main(String[] args) {
		User10 ob = new User10();
		
		try {
			ob.setValue(-3);//try-catch로 잡아준다.
			int n = ob.getValue();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
			//e.printStackTrace(); -- 이거 쓰는게 원래 원칙이다. 
		} 
		System.out.println("-------------");
	}
}

//잘못 작성된 경우 . 
class User10 {
	private int value;
	
	public void setValue(int value) throws Exception { //메소드를 호출하는 곳에서 예외를 catch 하도록 설정 
		//-3을 넣었는데 왜 0이나오지? 못 넣게 해야하는 거 아닐까
		if(value<0) {
			throw new Exception("0 이상만 가능합니다."); //문제를 발생시킨다.
												   //강제로 checked 예외를 발생 (Exception 예외 발생)
		}
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
