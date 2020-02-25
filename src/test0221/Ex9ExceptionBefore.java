package test0221;

public class Ex9ExceptionBefore {
	public static void main(String[] args) {
		User9 ob = new User9();
		
		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
	}
}

//잘못 작성된 경우 . 
class User9 {
	private int value;
	
	public void setValue(int value) {
		//-3을 넣었는데 왜 0이나오지? 못 넣게 해야하는 거 아닐까
		if(value<0) {
			return;
		}
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
