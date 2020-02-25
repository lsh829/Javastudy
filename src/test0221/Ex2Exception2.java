package test0221;

import java.util.Scanner;

//Ex1을  예외 처리한 코드
//	try - catch 이용 

//문제점
//	에러가 발생했다는 상황별로 알려주지 않는다.
public class Ex2Exception2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		//2) 예외를 처리하는 두번째 방법
		try { 
			//정상일 때 실행하는 코드
			System.out.print("두 정수?");
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a/b;
			
			System.out.println(a+"/"+b+"="+c);
			
		} catch (Exception e) {
			//비정상일 때 실행하는 코드 
			//오류가 발생했을 경우, 출력되는 메세지
			System.out.println("입력 사항이 올바르지 않거나...");
		
		}
		
		
		System.out.println("end..."); //end가 출력되는 것으로 보아, 프로그램이 죽지 않았음을 알 수 있다.
		
		sc.close();
	}
}
