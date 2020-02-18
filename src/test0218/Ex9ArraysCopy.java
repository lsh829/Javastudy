package test0218;

import java.util.Arrays;

public class Ex9ArraysCopy {
	public static void main(String[] args) {
		int[] aa = {10, 20, 30, 40, 50};
		
		// 배열 복사-1
								//대상, 새로운 길이
		int[] bb = Arrays.copyOf(aa, aa.length);
		//아래와 같은 형식도 가능
		//int[] bb = Arrays.copyOf(aa, aa.length-1); // 4개복사
		//int[] bb = Arrays.copyOf(aa, aa.length+2); // 5개 복사하고 나머지 0
		
		System.out.println(aa==bb);//false - 값은 같지만, 주소는 다르다. 
								   //즉, 같은 데이터가 아니다.
		System.out.println(Arrays.toString(bb));
		
		// 배열 복사-2 
								//대상, from, to-1 까지 - subString하고 같은 개념
		int[] cc = Arrays.copyOfRange(aa, 1, 4);
		System.out.println(Arrays.toString(cc)); //[20,30,40]
		
		// 배열 복사 -3 : 배열 복사 2 보다 속도가 더 빠르다.
		int[] dd = new int[aa.length];
		System.arraycopy(aa, 0, dd, 0, aa.length);
		System.out.println(Arrays.toString(dd));
	}
}
