package test0228;

import java.util.Scanner;

public class Ex10Systemexit {
	//main이 끝난다고 하더라도 프로그램이 종료되지는 않을 수도 있다. (스레드 개념을 배울 경우에 이런 경우가 있음)
	//main은 프로그램의 시작지점이지만, 종료지점을 의미하는 것은 아니다.
	//하지만 System.exit(0) 은 만나게 되면 무조건 프로그램을 중도에 강제로 멈춘다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			while(true) {
				System.out.print("정수?");
				n = sc.nextInt();
				
				if(n==0) {
					//System.exit(0); //프로그램 강제 종료
					//당연히 프로그램의 구문은 System.exit(0)에서 종결되므로 이후의 finally 구문은 절대로 실행되지 않는다.
					return; //finally block을 실행한다.
					//단, return을 하면 (프로그램 구문의 끝입니다)구문은 실행하지 않는다.
					//그만큼 finally 블록은 강력하다는 것을 의미한다.
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block....");
			sc.close();
		}
		System.out.println("프로그램 구문의 끝입니다.");
	}
}
