package score2;

// 이렇게 짤거라는 '기본설계도' 역할 
public interface Score {
	public int getCount(); //인원수
	public int append(ScoreVO vo); //데이터 추가
	public ScoreVO[] getListData(); //배열 데이터 저장하는 방
	public ScoreVO get(String hak); //학번검색
}
