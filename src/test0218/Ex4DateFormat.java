package test0218;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex4DateFormat {
	public static void main(String[] args) {
		DateFormat df; //날짜와 관련된것.
		Date date = new Date();
		String s;
		
		df = DateFormat.getDateInstance();//2020. 2. 18
		df =DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREAN);//2020년 2월 18일 (화)
		s = df.format(date);
		System.out.println(s); 

	}
}
