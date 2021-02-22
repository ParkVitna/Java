package ch06.exam11;

public class User {
	//Field (데이터를 저장)
	//인스턴스 필드 선언
	String id;
	String name;
	String password;
	static String nation = "한국"; //객체를 만들지 않아도 사용할 수 있음
	
	//Constructor
	User(String name){
		this.name = name;
		//객체 생성할 때 필드 (static 제외) 값 받음
	}
	
	
	//Method
	//인스턴스 메소드 -> 이 안에서는 인스턴스를 사용가능
	static void info() {
		//name = "홍길동"; name은 객체 안에 존재하기 때문에 객체가 있어야만 쓸 수 있으므로 오류남
		//this 쓸 수 없음 -> this는 객체 자기자신. 객체가 있어야만 쓸 수 있으므로 오류남
		nation = "대한민국";
		System.out.println("모든 User는 한국인 입니다.");
	}
	
	void login() {
		System.out.println(name + "님이 로그인 합니다."); //필드의 name 사용하고 있음 -> 객체가 있어야 쓸 수 있음.
	}
	
	void logout() {
		System.out.println(name + "님이 로그아웃 합니다.");
	}


}
