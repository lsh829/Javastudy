package test0221;

import java.util.InputMismatchException;
import java.util.Scanner;
//비정상인데 정상으로 처리가 되어버림

//throw : 예외 던지는 것
//throws : 예외 잡으라고 알려주는것 


public class Ex8ThrowThrows {
	public static void main(String[] args) {
		User8 u= new User8();
		u.input();
	}
}

class User8 {
	private Scanner sc = new Scanner(System.in);
	
	//throws Exception : 메소드 호출한 곳에서 Exception checked 예외를 catch하도록 설정  
	private int inputScore() throws Exception {
		int result = 0; 
		
		try {
			result = sc.nextInt();
			
			if(result <0 || result > 100) {
				//예외 던짐. 실행을 중지하고 호출 함수 쪽에서 예외를 발생시킴.
				throw new Exception("점수는 0~100 사이만 입력 가능합니다."); 
			}
			
		} catch (InputMismatchException e) {
			//System.out.println("숫자만 입력 가능합니다."); 
			sc.nextLine(); //문제가 있는 데이터를 읽어서 버림.
			
			
			//문제일으킬거야~ 라는 의미의 예외를 명시적으로 발생한다.
			//	new 를 해줘야한다. -- 객체 
			throw new Exception("숫자만 입력 가능합니다.");
		}
		return result; 
	}
	
	public void input() {
		String name,tel;
		int kor, eng;
		
		
		//Exception예외를 위에서 던졌으니까 잡아줘야한다.
		try {
			
			System.out.print("이름 ?");
			name = sc.next();
			
			System.out.print("국어?");
			kor = inputScore();
			
			System.out.print("영어?");
			eng =  inputScore();
			
			System.out.print("전화번호?");
			tel = sc.next();
			
			System.out.println(name+":"+kor+":"+eng+":"+tel);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("--------------");
		sc.close();
		
	}
}
