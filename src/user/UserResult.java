package user;

public class UserResult {
	//객체 의존 관계 파괴
	//private User user = new User(); //새로운 User 객체이기 때문에, 이렇게 생성하면 안됨.
	
	//옳게 짜야하는 방법
	private User user;
	
	public UserResult(User user) {//생성자를 이용한 의존관계 수정
		this.user = user;
	}
	
	public void write() {
		System.out.println("\n데이터 출력...");
	
		UserVO[] list = user.getDataList(); //데이터 넘겨 받음.
		int cnt = user.getCount();
		
		for(int i =0; i<cnt; i++) {
			UserVO vo = list[i];
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.print(adult(vo.getAge())+"\n");	
		}
		System.out.println();
	}
	
	
	//성인인지 아닌지 판별하는 adult 메소드
	public String adult(int age) {
		return age>=19? "성인":"미성년자";
	}
}
