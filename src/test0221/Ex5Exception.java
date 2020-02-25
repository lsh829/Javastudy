package test0221;

//ctrl + shift + o = import 정리해주는 단축키
import java.io.BufferedReader;
import java.io.InputStreamReader;

//안 좋은 점
//	왜 문제가 발생했는지 클라이언트는 알 수 가 없다. 
public class Ex5Exception {
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
		
		}catch (Exception e) {
				//Exception : 모든 예외를 다 catch 가능
			System.out.println(e.toString());
		}
		
		//System.out.println(a+"/"+b+"="+c); - 오류 발생 이유 : 초기화를 안해서. 
		//									 - try { } 블럭 안 부분이 반드시 실행된다는 보장이 없기 때문이다. 
		
		System.out.println("end..");
		
		
	}
}
