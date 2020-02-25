package score2;
//인터페이스 구현
public class ScoreImpl implements Score {
	private int count;
	private ScoreVO[] list = new ScoreVO[10]; //10명 저장
	
	
	@Override
	public int getCount() {
		return count;
	}

	@Override
	public int append(ScoreVO vo) {
		if(count >= 10) {
			return -1;
		}
		
		list[count++] = vo;
		
		return count;
	}

	@Override
	public ScoreVO[] getListData() {
		return list;
	}

	@Override
	public ScoreVO get(String hak) {
		for(int i=0; i<count; i++) {
			//학번 검색
			if(list[i].getHak().equals(hak)) {
				return list[i];
			}
		}
		//학번이 없으면 null 값을 던져줍니다. 
		return null;
	}
	
}
