package ch11.exam01;

public class Member {
	//Field
	private String id;
	private String name;
	
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Ctrl + Space  -> equals �������ؼ� ��� (���ڿ� ��)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // instanceof() ��ü Ÿ�� Ȯ��
			Member m = (Member) obj; //MemberŸ������ ����Ÿ�Ժ�ȯ
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
