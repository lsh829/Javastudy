package test0221;

public class Ex11ExceptionAfter {			//throws Exception : 메소드를 호출한 곳으로 예외를 넘김
	public static void main(String[] args) throws Exception { //JVM 이 main이 부릅니다. 
		User11 ob = new User11();
		
		ob.setValue(-3);//try-catch로 잡아준다.
		int n = ob.getValue();
		System.out.println(n);
		
		System.out.println("end..");
		
	}
}

//잘못 작성된 경우 . 
class User11 {
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
