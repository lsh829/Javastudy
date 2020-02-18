package user;

import java.util.Scanner;
// main
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserService us = new UserService();
		int ch;
		
		while(true) {
			do {
				System.out.print("1.입력 2.출력 3.종료 =>");
				ch = sc.nextInt();
			}while(ch<1 || ch>3);
			
			if(ch==3) {
				break;
			}
			switch (ch) {
			case 1: us.input(); break;
			case 2: us.print(); break;
			}
		}
		
		
		sc.close();
	}
}
