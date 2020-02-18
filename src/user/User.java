package user;
//데이터 보관용 class
//데이터를 입력 받아서 저장
public class User {
		//VO를 배열로 저장
		private UserVO[] list;
		private int count; //인원 수 - 데이터가 추가될 때만 늘어나야 한다.
		
		public User() {
			//list = new UserVO[10];
			allocation(10);
			
		}
		
		//ArrayList Class (추후 진도 예정)
		private void allocation(int capacity) { //10개가 넘어옴.
			UserVO[] temp = new UserVO[capacity];
			if(list != null && count > 0) {
				System.arraycopy(list, 0, temp, 0, count);
			}
			list = temp;
		}
		
		//외부에서 몇 명있는지 알 수 있다. 
		public int getCount() {
			return count;
		}
		
		//list에 데이터 하나씩 담기
		public int append(UserVO vo) {
			if(count >= list.length) {
				//배열을 다 차면 10개씩 늘리기 
				allocation(list.length+10);
			}
			
			list[count++] = vo; //vo를 list에 담고 count를 증가시킨다.
								//현재 상황에서는 10번 이상 담으면 터짐.
			return count; //인원 수 누적
			
		}
		
		//외부에서 접근 못하는 list를 가져올 수 있는 메소드
		public UserVO[] getDataList() {
			return list;
		}
		
		//해당 인덱스의 UserVO 객체 반환
		public UserVO get(int idx) {
			if(idx>=count || idx <0) {
				return null;
			}
			return list[idx];
		}
	
}
