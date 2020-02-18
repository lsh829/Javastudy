package user;

import java.util.Scanner;

public class UserService {
	private Scanner sc = new Scanner(System.in);
	private User user = new User();
	// 생성자를 이용하여 의존관계 설정
	private UserResult ur = new UserResult(user); //uservo의 데이터가 담긴 user을 userresult에 넘겨줌
	
	public void input() {
		System.out.println("\n자료 등록...");
	
		UserVO vo = new UserVO();
		
		System.out.print("이름?");
		vo.setName(sc.next());
		
		System.out.print("나이?");
		vo.setAge(sc.nextInt());
		
		//User에 담기 [데이터 보관하기]
		user.append(vo);
		System.out.println("등록완료...\n");
	
	}
	
	public void print() {
		ur.write();
	}
}
