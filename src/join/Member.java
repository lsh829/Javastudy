package join;
//회원가입한 고객들의 개개인의 정보를 배열로 담아 놓는 공간
public class Member {
	private MemberVO[] list;
	private int count;
	
	public Member() { // 생성자
		list = new MemberVO[10]; //생성자초기화
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public MemberVO[] getListData() {
		return list;
	}
	
	public int append(MemberVO vo) {
		if(count >= list.length) {
			return -1;
		}
		
		list[count++] = vo;
		
		return count;
		
	}
	
	//id 검색
	public MemberVO get(String id) {
		for(int i=0; i<count ; i++) {
			if(list[i].getId().equals(id)) {
				return list[i];
			}
		}
		return null;
	}
	
	

}
