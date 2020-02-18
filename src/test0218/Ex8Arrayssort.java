package test0218;

import java.util.Arrays;
import java.util.Collections;

//Arrays 클래스 - sort
public class Ex8Arrayssort {
	public static void main(String[] args) {
		String[] ss = {"자바","CSS","HTML","스프링","AI"};
		
		Arrays.sort(ss);
		System.out.println("오름차..."); //작은것 --> 큰것
		for(String s : ss) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		Arrays.sort(ss, Collections.reverseOrder());
		System.out.println("내림차...");// 큰것 --> 작은것 
		for(String s : ss) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		int[] nn = {10, 5, 80, 70};
		//String s = nn.toString();//[I@15db9742 형식 -배열의 주소값.
		String s = Arrays.toString(nn);//[10, 5, 80, 70] 형식 - 배열의 값.
		System.out.println(s); 
		
	}

}
