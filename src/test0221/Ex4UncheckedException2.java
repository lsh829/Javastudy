package test0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4UncheckedException2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
		
		
		try {
			System.out.print("첫번째 수?");
			a = Integer.parseInt(br.readLine());
			
			System.out.print("두번째 수?");
			b = Integer.parseInt(br.readLine());
			
			c = a/b;
			System.out.println(a+"/"+b+"="+c);
			
			// 일어날 수 있는 문제점 예측 
			// 1) 
		}catch (IOException e) { //checked 예외 -- 반드시 잡아야만 한다. 
			
			e.printStackTrace();
		}catch (NumberFormatException e) { 
			// NumberFormatException : uncheked 예외
			//		반드시 catch 할 필요 없지만 예외 발생하면 프로그램은 비정상 종료
			//		문자열을 숫자로 변경 불가능한 경우 발생
			
			
			//System.out.println("숫자만 입력 가능합니다."); //클라이언트에게 보여주는 용 
			//System.out.println(e.toString()); //개발자한테 보여주는 용 
											    //java.lang.NumberFormatException: For input string: "a"
			//System.out.println(e.getMessage()); //For input string: "a"
			
			//*****
			e.printStackTrace(); //정말 자세하게 에러가 왜 발생했는지를 알려준다.-개발자에게 최적
								 //NullPointerException - 가장 많이 발생하는 예외
		}catch (ArithmeticException e) {
				//unchecked 예외
			System.out.println("0으로 나눌 수 없습니다.");
			
		}catch (Exception e) {
				//Exception : 모든 예외를 다 catch 가능
				//		여러 예외를 catch한 경우 가장 마지막에 기술해야함;
			System.out.println(e.toString());
		}
		System.out.println("end..");
		
		
	}
}
