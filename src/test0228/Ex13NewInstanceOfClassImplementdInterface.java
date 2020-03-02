package test0228;

public class Ex13NewInstanceOfClassImplementdInterface {
	public static void main(String[] args) {
		String className = "test0228.Test13"; //패키지명.클래스명 일치시켜야 함! << 각자 패키지명과 클래스명에 맞게 작성한 후 실행
		try {
			Class<?> cls = Class.forName(className);
			User13 uu = (User13) cls.newInstance();
			int s  = uu.add(10,5);
			uu.print("합",s); //Ex12에서는 클래스에 의존적이였다면 Ex13는 인터페이스에 의존적이다.
			//인터페이스르르 먼저 설계하고 구현하는 것이 좀 더 작업하는 데 효율적이다. (지금은 체ㅏㅁ이 되지 않을 것임)
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


interface User13 {
	public int add(int a, int b); 
	public void print(String title, int result); 
}

class Test13 implements User13 {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void print(String title, int result) {
		System.out.println(title + "=>" +result);
		
	}
	
}