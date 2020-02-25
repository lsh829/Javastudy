package score2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreService  {
	private Scanner sc = new Scanner(System.in);
	private Score score = new ScoreImpl(); //업 캐스팅 
	
	public void input() {
		System.out.println("\n입력...");
		try {
			ScoreVO vo = new ScoreVO();
			String s;
			int n;
			
			System.out.print("학번?");
			vo.setHak(sc.next());
			
			System.out.print("이름?");
			s = inputName();
			vo.setName(s);
			
			System.out.print("국어?");
			n = inpurScore();
			vo.setKor(n);
			
			System.out.print("영어?");
			n = inpurScore();
			vo.setEng(n);
			
			System.out.print("수학?");
			n = inpurScore();
			vo.setMat(n);
			
			
			if(score.append(vo)>0) {
				System.out.println("추가 성공...");
				
			}else{
				System.out.println("정원 초과로 추가 실패..");
			}
			
			
		}catch (InputMismatchException e) {
			System.out.println("점수는 숫자만 입력 가능합니다.");
		}catch (ScoreValidException e) {
			System.out.println(e.getMessage());
		}catch (KoreanValidException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------\n");
		
	}
	public void print() {
		System.out.println("\n출력...");
		
		for(int i=0; i<score.getCount(); i++) {
			ScoreVO vo = score.getListData()[i];
			System.out.println(vo);
		}
	}
	
	private String inputName() throws KoreanValidException {
		String s = null;
		String regex = "^[가-힣]+$"; //한글의 시작과 끝
									// \uac00-\ud7a3 이게 원래는 코드값
									// ^ :시작  | [가-힣] :한글자 이상의 한글 | $ :끝
		s = sc.next();
		
		if(! Pattern.matches(regex, s)) { //한글입력 안했니?
			throw new KoreanValidException("이름은 한글만 가능합니다.");
			
		}
		
		
		return s;
	}
	
	private int inpurScore() throws ScoreValidException {
		int s = 0;
		
		try {
			s = sc.nextInt();
			if(s<0 || s>100) {
				throw new ScoreValidException("점수는 0~100 점 사이만 가능 합니다.");
			}
		} catch (InputMismatchException e) {
			sc.nextLine(); //버린다..?
			throw e; // 예외를 다시 던짐.
		}
		return s;
	}
}
