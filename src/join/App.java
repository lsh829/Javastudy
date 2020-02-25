package join;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		int ch;
		MemberService ms = new MemberService();
		
		while(true) {
			do {
				System.out.println("1.가입 2.출력 3.아이디검색 4.종료");
				ch = sc.nextInt();
			}while(ch<1 || ch>4);
			
			if(ch==4) {
				break;
			}
			
			switch (ch) {
			case 1: ms.input(); break;
			case 2: ms.print();break;
			case 3: ms.findById(); break;
			
				
			}
		}
		
		sc.close();
	}
}
