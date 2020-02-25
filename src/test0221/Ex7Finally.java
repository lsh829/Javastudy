package test0221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7Finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		try {
			System.out.print("두 수?");
			a = sc.nextInt(); //정수가 아닌거 입력 못 받는다.
			b = sc.nextInt();
			c =a + b;
			
			System.out.println(c);
		} catch (InputMismatchException e) { 
			//InputMismatchException: unchecked 예외
			// 		Scanner의 nextInt()등에서 숫자가 아닌 문자열을 입력한 경우 발생
			//System.out.println("숫자만 입력 가능");
			e.printStackTrace();
		}finally {
			System.out.println("예외와 상관없이 실행...");
			sc.close();
		}
		
		System.out.println("end...");
	}
}
