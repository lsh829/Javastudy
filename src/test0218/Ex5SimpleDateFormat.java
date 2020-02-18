package test0218;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex5SimpleDateFormat {
	
	// 두 날짜 사이의 간격을 구하는 메소드
	public static long diffOfDay(String begin, String end) {
		long diff = 0;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			begin = begin.replaceAll("(\\- | \\. | \\/)", "");
			end = end.replaceAll("(\\- | \\. | \\/)", "");
			
			//Date형으로 고치기
			Date d1 = sdf.parse(begin); //Tue Feb 18 00:00:00 KST 2020
			Date d2 = sdf.parse(end); //Fri Dec 25 00:00:00 KST 2020
			
			//두 날짜 사이의 간격을 구할 수 있다. 
			diff = (d2.getTime()-d1.getTime())/(1000*60*60*24); //초->분->시->일
			//1608822000000 - 1581951600000
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return diff;
	
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			Date date = new Date();
			
			//(******) SimpleDateFormat 중요
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日 HH:mm:ss");
			
			String s = sdf.format(date);
			System.out.println(s);//2020年 02月 18日 10:07:43
			
			sdf = new SimpleDateFormat("yyyy-MM-dd");
			s = "2000-10-10";
			Date date2 = sdf.parse(s);
			System.out.println(date2);//Tue Oct 10 00:00:00 KST 2000
			
			long a = diffOfDay("20200218", "20201225");
			System.out.println(a);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
