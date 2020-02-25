package score2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScoreService ss = new ScoreService();
		int ch;
		
		try {
			while(true) {
				do {
					System.out.println("1.입력 2.출력 3.종료 =>");
					ch = sc.nextInt();
				}while(ch<1 || ch>3);
				
				if(ch==3) {
					break;
				}
				
				switch (ch) {
				case 1:ss.input();break;
				case 2:ss.print();break;	

				}
			}
		} finally {
			sc.close();
		}
	}
}
