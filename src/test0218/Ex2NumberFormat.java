package test0218;

import java.text.NumberFormat;

public class Ex2NumberFormat {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		
		String s1 ="1000";
		String s2 = "1000.12";
		String s3 = "1,000";
		
		try {
			Number n1 = nf.parse(s1);
			Number n2 = nf.parse(s2);
			Number n3 = nf.parse(s3);
			
			System.out.println(n1+":"+n2+":"+n3); //1000:1000.12:1000
			
			//요구사항: s2의 소수점을 버린다.
			nf.setParseIntegerOnly(true); //오로지 정수만 parsing
			n2 = nf.parse(s2);
			System.out.println(n2); //1000
			
			//NumberFormat.getPercentInstance() - %
			double d = 0.12;
			NumberFormat nf2 = NumberFormat.getPercentInstance();
			String s = nf2.format(d);
			System.out.println(s); //12%
			
		} catch (Exception e) { //Exception 은 예외의 최상위
			e.printStackTrace();
			
		}
	}
}
