package test0221;

import java.util.Scanner;
//age 문제 - 숫자를 잘못 입력, 문자를 입력
//단점 : 예외를 상황별로 처리를 안함
public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User15 user = new User15();
		
		try {
			System.out.print("이름?");
			user.setName(sc.next());
			
			System.out.print("나이?");
			user.setAge(sc.nextInt()); //예외 가 있는 메소드를 호출
			
			System.out.println(user.getName()+":"+user.getAge());
		} catch (Exception e) { //예외 잡아줌.
			System.out.println("입력 오류 입니다.");
		}finally {
			sc.close();
		}
		
		System.out.println("end...");
	}
}

class User15 {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception { //보내는 시점
		
		//발생 시점 
		if(age<0) {
			throw new Exception("나이는 0보다 크거나 같아야 합니다. ");
		}
		
		this.age = age;
	}
	
	
}

