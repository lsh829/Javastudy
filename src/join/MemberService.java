package join;

import java.util.Scanner;

public class MemberService extends Member {
	private Scanner sc = new Scanner(System.in);
	private MemberResult mr = new MemberResult(this); //...? //this는 memberservice 객체
	
	public void input() {
		System.out.println("데이터 입력...");
		MemberVO vo = new MemberVO(); //한사람의 객체를 생성해줘야한다.
		
		System.out.print("아이디:");
		vo.setId(sc.next());
		
		System.out.print("패스워드:");
		vo.setPw(sc.next());
		
		System.out.print("이름:");
		vo.setName(sc.next());
		
		System.out.print("생년 월일:");
		vo.setBirth(sc.next());
		
		int result = append(vo); //append Member(아버지) 것
		if(result == -1) {
			System.out.println("정원 초과...\n");
		}else {
			System.out.println("가입 완료...\n");
		}
	}
	
	public void print() {
		System.out.println("\n 데이터 출력...");
		mr.write();
	}
	
	public void findById() { //나는 원래..for문으로 검색했었다.
		System.out.println("\n 아이디 검색...");
		String id;
		System.out.print("검색할 아이디:");
		id = sc.next();
		
		MemberVO vo = get(id);
		if(vo==null) {
			System.out.println("등록된 아이디가 아닙니다.");
		}else {
			System.out.println(vo);
		}
		System.out.println();
	}
}
