package join;

public class MemberResult {
	private Member member;//member 가 있어야 출력이 가능하다. 
	//new 하면 안돼요. --> MemberService에서 상속 받음으로써 객체 가 생성이 됐으니까.
	//private Member member = new Member();
	
	public MemberResult(Member member) {
		this.member = member;
	}
	
	//출력
	public void write() {
		MemberVO[] list = member.getListData();//1)
		for(int i=0; i<member.getCount();i++) {
			MemberVO vo = list[i];//1)
			//MemberVo vo = member.getListData()[i]; ==>이거 한줄하고  1)은 같은 의미다.
			System.out.println(vo); //Member에서 toString을 재정의 했기 때문에  vo만 적어도 된다. 
		}
		System.out.println();
	}
}
