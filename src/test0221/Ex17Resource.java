package test0221;

import java.util.Scanner;

public class Ex17Resource {
	public static void main(String[] args) {
		int n;
		//JDK 7 이상. 자동으로 리소스가 close(sc.close ()) 됨.
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("나이?");
			n= sc.nextInt();
			System.out.println(n);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
