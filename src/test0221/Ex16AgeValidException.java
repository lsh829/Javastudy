package test0221;

import java.util.InputMismatchException;
import java.util.Scanner;
//age 문제 - 숫자를 잘못 입력, 문자를 입력
public class Ex16AgeValidException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User16 user = new User16();
		
		try {
			System.out.print("이름?");
			user.setName(sc.next());
			
			System.out.print("나이?");
			user.setAge(sc.nextInt()); //예외 가 있는 메소드를 호출
			
			System.out.println(user.getName()+":"+user.getAge());
		}catch (InputMismatchException e) {
			System.out.println("숫자만 입력 하세요");
		}catch (AgeValidException e) { //예외 잡아줌.
			System.out.println("나이 입력 오류 입니다.");
		}catch (Exception e) { //생각하지 못한 오류 //아버지 Exception이기 때문에 맨 마지막에다가 
 			System.out.println(e.toString());
		}finally {
			sc.close();
		}
		
		System.out.println("end...");
	}
}

//사용자 정의 예외 클래스 
class AgeValidException extends Exception{ 
	//간단하게 설명 
	//객체 전송 - 객체가 가지고 있는 내용을 byte형태로 바꿔서 보내줄 수 있다.
	//이때 밑의 serialVersionUID를 통해서 보낼 수 있다.
	//추후 네트워크 부분에서 더 자세히 알아보자. 
	private static final long serialVersionUID = 1L;

	//단점 throw new Exception("나이는 0보다 크거나 같아야 합니다. "); 이렇게 메세지를 못보낸다.
	//하지만 생성자를 만들면 보낼 수 있게된다. 방법은 밑에서
	public AgeValidException(String msg) {
		super(msg);
	}
}




class User16 {
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
	public void setAge(int age) throws AgeValidException { //보내는 시점
		
		//발생 시점 
		if(age<0) {
			throw new AgeValidException("나이는 0보다 크거나 같아야 합니다. ");
		}
		
		this.age = age;
	}
	
	
}

