package test0228;

import java.util.regex.Pattern;

public class Ex16RegularExpression {
	public static void main(String[] args) {
		String s, p;
		
		//p="\\d{1,3}";
		//숫자가(\\d) 첫 째 자리에서 셋 째 자리까지 있어야 함({1,3})
		//s="100";
		
		//욕설 필터링
		//p=".*(?i)(ac|바보).*"; //여기서 (?i)는 대소문자를 구분하지 않음.
		//s="우리 바보 너 ac 후후";	//"바보" "ac" 또는 "AC" 욕설 필터링
		
		//한글만 2~10글자
		//p = "[가-힣]{2,10}";
		//s = "한글만작성이가능";
		
		//한글 1자 이상
		//p = "^[가-힣]+$";		//한글 1자 이상
		//s="크크크";

		//욕설 필터링 advanced (중간에 숫자를 입력했어도 감지하기)
		//s="우리 바1보 너 a1c 후후";
		//s = s.replaceAll("\\d", "");
		//p = ".*(?i)(ac|바보).*";
		//System.out.println(s);
		
		//p="c.*t";	//c로 시작하고 c다음의 .* (모든 문자열이 0개 이상) t로 끝나야 한다.
		s="cbasbt";	//true
		p="c*t";	//c가 0개 이상부터
		
		System.out.println(s.replaceAll(p, ""));
		if (Pattern.matches(p, s)) {
			System.out.println("가능");
		} else {
			System.out.println("불가능");
			
		}

	}
}
