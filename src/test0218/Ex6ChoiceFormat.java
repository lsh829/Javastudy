package test0218;

import java.text.ChoiceFormat;
//ChoiceFormat을 이용한  평점 구하기 프로그램
public class Ex6ChoiceFormat {
	public static void main(String[] args) {
		//switch-case문 
		
		//double[] s = {60,70,80,90};
		//String[] g = {"D","C","B","A"};
		
		//낮은 것 부터 큰 순서.
		//s와 g간의 순서, 개수 맞추어야함.
		double[] s = {0,60,70,80,90};
		String[] g = {"F","D","C","B","A"};
		ChoiceFormat cf = new ChoiceFormat(s,g); //한계값, 출력할 대상
		
		int[] ss = {50,80,100,75,90};
		for(int n : ss) {
			System.out.println(n+":"+cf.format(n));
		}
	}
}
