package join;
//1명의 정보를 저장할 수 있는 공간 
public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String birth;
	
	//getter/setter 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	//오버라이딩
	//id가 동일하면 동일 인물로

	@Override
	public String toString() {
		String s;
		if(id == null) {
			return null;
		}
		
		s = id+"\t"+name+"\t"+birth;
		return s;
	}
	
	
	
		
	
}
