package test0218;

import java.util.Arrays;
// Arrays.equals 와 Arrays.deepEquals의 차이 
public class Ex10ArraysEquals {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		int[] c = {1,2,3,4,5,6};
		
		//주소 비교
		System.out.println(a==b);//false
		System.out.println(a==c);//false
		System.out.println(a.equals(b));//false
		
		//값 비교
		System.out.println(Arrays.equals(a, b));//true
		System.out.println(Arrays.equals(a, c));//false
		
		//이차원 배열 
		int[][] aa = {{1,2,3},{4,5,6}};
		int[][] bb = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.equals(aa, bb)); //false
			//(***) 2차원 배열에서는 1차원이 가진 주소를 비교하므로 false
			//2차원배열의 equals는 주소를 비교
			// 얕은 비교
		
		System.out.println(Arrays.deepEquals(aa, bb)); //true
			//(***) 2차원 배열에서는 1차원이 가진 값을 비교하므로 true
			//2차원배열의 deepEquals는 값을  비교
			//깊은 비교
		
		
	}
}
