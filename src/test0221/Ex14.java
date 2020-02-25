package test0221;
//영화좌석. - 렌클라 응용..?
public class Ex14 {
	public static void main(String[] args) {
		
		User14 ob = new User14();
		
		try {
			ob.set(-10);
			int n = ob.getAge();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("end...");
		}

	}
}

class User14 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		
		if(age<0) {
			throw new Exception("나이는 0이상이다"); //1-1)
		}
		this.age = age;
	}
	
	public void set(int age) throws Exception{
		try {
			setAge(age);//throws가 있는데 , try-catch안해주면. 오류난다
		} catch (Exception e) { //1-2) 1-1에서 던지면 객체가 1-2로 받아진다. -- 1-1의 예외를 잡는다.
			// System.out.println(e.toString());
			throw e; //Exception 객체 
					 //잡은 예외를 다시 던진다. 
		} 
	}
}
