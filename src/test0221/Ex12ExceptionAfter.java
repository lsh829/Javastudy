package test0221;

public class Ex12ExceptionAfter {			
	public static void main(String[] args){ //JVM 이 main이 부릅니다. 
		User12 ob = new User12();
		
		ob.setValue(-3);//try-catch로 잡아준다.
		int n = ob.getValue();
		System.out.println(n);
		
		System.out.println("end..");
		
	}
}

//잘못 작성된 경우 . 
class User12 {
	private int value;
	
	public void setValue(int value) { 
		//-3을 넣었는데 왜 0이나오지? 못 넣게 해야하는 거 아닐까
		
		try {
			if(value<0) {
				throw new Exception("0 이상만 가능합니다."); 
			}
			this.value = value;
			
		} catch ( Exception e) {//throw new Exception("") 한것을 catch합니다.
			// 예외를 이곳에서 catch 해서 메소드 호출할 곳에서는 예외를 잡을 수 없다.
			// 잘못 작성된 코드
			System.out.println(e.toString());
			
		}
	}
	
	public int getValue() {
		return value;
	}
}
