package test0221;

import java.util.Scanner;
// 10과 0을 입력하면, 오류가 나타납니다.
// 하지만 10과 5를 입력하면, 돌아갑니다.
// 예외처리가 필요한 경우를 알 수 있습니다.

// <발생할 수 있는 문제점>
// 1)클라이언트가 문자를 입력할 경우
// 2)숫자를 입력했어도, b라는 부분이 0이 입력 될수있는 경우
// 3)클라이언트가 소수점을 입력할 경우
// 4)a,b는  int임으로 21억이 최댓값인데, 그 이상이 입력될 경우
// 이와 같은 문제점들을 '예외'처리를 해줘야합니다.

// 예외처리란? 
// 일어날 수 있는 돌발상태를 대처하는것.
// 네트워크 - 랜선이 뽑혔을 경우, 카톡에서 네트워크 연결이 안되었다는 안내 메세지를 보여주는 것과 같다.

public class Ex1Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("두 정수?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//1) 첫번째 예외 처리 방법
		//		정상일 때와, 비정상일 때의 코드가 섞여있다.
		if(b==0) {
			System.out.println("0으로 나눌 수 없어요.");
			return;
		}
		
		c = a/b;
		
		System.out.println(a+"/"+b+"="+c);
		
		System.out.println("end...");
		
		sc.close();
	}
}
