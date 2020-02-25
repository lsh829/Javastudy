package test0221;

import java.util.Scanner;

public class Ex6Finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		int idx = 0;
		
		String s;
		
		try {
			System.out.println("이름 입력[종료: 문자열 입력하지 않고 엔터]...");
			
			while((s= sc.nextLine()).length() != 0) {
				names[idx++] = s;
				System.out.print("이름입력:"); //예외발생하면 실행 안함.
			}
			
			System.out.println("------------------"); //예외가 발생하면 실행 안함 
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//ArrayIndexOutOfBoundsException : unchecked 예외
			//				배열의 첨자가 범위를 벗어나면 발생하는 예외
			System.out.println("입력을 초과 했습니다..");
		}finally {
			//try {} finally {} 처럼 catch가 없어도 가능 
			System.out.println("예외와 상관 없이 실행됩니다. ");
			sc.close();			
		}
		
		
		for(String str : names) {
			System.out.print(str+" ");
		}
		System.out.println();
		
	}
	
}
