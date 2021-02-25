package ch11.exam01;

public class Member {
	//Field
	private String id;
	private String name;
	
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Ctrl + Space  -> equals 재정의해서 사용 (문자열 비교)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // instanceof() 객체 타입 확인
			Member m = (Member) obj; //Member타입으로 강제타입변환
			if(id.equals(m.id) && name.equals(m.name)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}

}
