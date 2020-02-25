package test0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3CheckedException {
	public static void main(String[] args) {
		// 한 번에 한 줄 씩 입력 받도록 BufferedReader (정확한 의미는 아니지만, 쉬운 설명)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		int a,b,c;
		
		
		
		try {			
			System.out.print("첫번째 수?");
			s = br.readLine(); //readLine()은 checked exception이 발생하므로
							   //	반드시 예외 처리를 해야함 : IOException 예외

			//자체적인 문제점을 보유하고 있는 메소드...
			   //프로그램을 짤 때, 문제가 있다는 것을 명시적으로 알려준다. (엑박이 뜨는 이유)
			   //그냥 사용이 불가하다
			   //문제처리를 해줘야 한다.
			   //API 를 참고하면
			   // 		public String readLine() throws IOException --IOException 을 처리하지 않으면 해당 메소드를 실행할 수 없습니다.
			
			a = Integer.parseInt(s); //s를 숫자로 바꾸는것.
			
			System.out.print("두번째 수?");
			b = Integer.parseInt(br.readLine()); 
			
			c = a/b;
			
			System.out.println(a+"/"+b+"="+c);
			
		} catch (IOException e) {
			//IOException : 입출력에 문제가 발생할 때 발생하는 예외
			//	checked  예외로 반드시 예외처리를 해야한다.
			// 	checked exception 은 메소드를 정의할 때 throws 한 예외 
			//	예외 처리를 하지 않으면 , 컴파일 오류가 발생하는 예외
			e.printStackTrace();
		}
		System.out.println("end...");
	}


}
