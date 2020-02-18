package test0218;

import java.text.ChoiceFormat;
//ChoiceFormat을 이용한  평점 구하기 프로그램2
public class Ex7ChoiceFormatLimit {
	public static void main(String[] args) {
		// #, < 두 가지는 "limit#value", "limit<value" 형태
		// < 는 경계값 포함 안함. 
		// 80점은 C
		String p ="60#D|70#C|80<B|90#A"; //70점이상이 C학점, 80은 C-81부터가 B
		int[] ss = {99, 95, 88, 70, 52, 60, 80};
		ChoiceFormat cf = new ChoiceFormat(p);
		
		for(int s: ss) {
			System.out.println(s+":"+cf.format(s));
		}
	}
}
