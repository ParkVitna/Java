package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인스턴스 멤버(필드, 메소드)는 반드시
		//객체 참조 변수를 통해서 접근 (반드시 객체 생성!)
		
		User user = new User("홍길동");
		//User user = null; -> NullPointException 오류 발생 (객체가 없는 상태에서 사용)
		
		System.out.println(user.name);
		user.login();
		user.logout();
		
		//정적 멤버(필드. 메소드)는 객체가 없어도 사용가능
		System.out.println(User.nation);
		User.info();
		

	}

}
