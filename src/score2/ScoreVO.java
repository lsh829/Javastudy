package score2;

public class ScoreVO {
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	//private int kor,eng,mat; -실무에서 이렇게 한줄에 다 넣어주면 안된다.
	
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	@Override
	public String toString() {
		String s;
		int tot;
		
		if(hak==null || name==null) return null;
		
		tot = kor+eng+mat;
		
		s = hak+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot;
		return s;
		
		//return "ScoreVO [hak=" + hak + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
	
}
