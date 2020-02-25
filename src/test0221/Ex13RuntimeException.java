package test0221;

public class Ex13RuntimeException {
	public static void main(String[] args) {
		User13 uu =new User13();
		
		/*
		uu.setValue(-3); //value가 보다 적어 RuntimeException 예외가 발생
						 //예외처리를 하지 않아 프로그램은 이곳에서 강제 종료 
		int n = uu.getValue();
		System.out.println(n);
		System.out.println("end...");
		*/
		
		try {
			uu.setValue(-3); 
			int n = uu.getValue();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("end...");
	}
}
class User13{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if(value < 0) {
			//RuntimeException 는 uncheckd 예외로 반드시 catch 할 필요가 없다. 
			throw new RuntimeException("0이상만 가능합니다.");
		}
		this.value = value;
	}
}
