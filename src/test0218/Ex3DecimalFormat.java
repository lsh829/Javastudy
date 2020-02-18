package test0218;

import java.text.DecimalFormat;

public class Ex3DecimalFormat {
	public static void main(String[] args) {
		
		//NumberFormat 자식 - DecimalFormat
		DecimalFormat df = new DecimalFormat("#,##0");
		
		String s;
		s = df.format(123456.123);
		System.out.println(s); //123,456 - 소수점이 떨어짐
		
		DecimalFormat df2 = new DecimalFormat("#,##0.#"); //.이후로는 소수점을 타나매여 반올림하여 나타나진다.
		//DecimalFormat df2 = new DecimalFormat("#,##0.0");//123,456.2
														 //.#과 .0의 차이점 - .0이 표시되느냐 안되느냐의 차이점. 
		//s = df2.format(123456.173);//123,456.2
		s = df2.format(123456);//123,456.0
		System.out.println(s);
		
		
	}
}
