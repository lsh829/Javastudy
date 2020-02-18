package test0218;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Ex1NumberFormat {
	public static void main(String[] args) {
		int n = 1234567;
		String s;
		
		s = String.format("%d", n);
		System.out.println(s);//1234567
		
		//NumberFormat 
		NumberFormat nf = NumberFormat.getInstance();
		s = nf.format(n);
		System.out.println(s);//1,234,567
		
		//double형도 가능
		double d = 13456.2626;
		s = nf.format(d);
		System.out.println(s);//13,456.263
		
		s = "12,345"; //,가 있어서 문자->숫자형으로 바꿀 수 없다.
		//문자열 --> 날짜로 바꿀 때 쓰는 메소드 : SimpleDateFormat --> parse 
		try {
			//Number ob = nf.parse(s); //예외처리를 해줘야한다.
			
			//(*****)
			//객체 간에는 형변환이 안된다.
			//단, 상하관계 일 경우, 형변환이 될 가능성이 있다.
			
			Long ob = (Long)nf.parse(s); //down casting  -- long형으로만 가능하다!!!
										 //Long과 Integer은 형제이기 때문에, 형변환이 불가하다.
			long x = ob+10;
			System.out.println(x);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		s = "1234.5"; //문자에서 Wrapper class - Double로 바꿀 수 있다.
		
		
		//NumberFomat.getCurrencyInstance - ￦ 표시
		//os의 국가별 설정에 따라 다르게 나옵니다.($...)
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		s = nf2.format(n);
		System.out.println(s);//￦1,234,567
		
		//국가별 상관없이 $로 출력하기
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);//(*****)
		s = nf3.format(n);
		System.out.println(s);//$1,234,567.00
		
		
		
		
		
		
	}
}
