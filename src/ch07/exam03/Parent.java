package ch07.exam03;

public class Parent {
	//Field
	public String lastName;
	public String firstName;
	
	//Constructor
	public Parent(String lastName, String fristName) { //부모클래스가 실행되는지 확인
		System.out.println("Parent 객체 생성");
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	//Method
	public void sound() {
		System.out.println("공부해라~~~~~");
	}

}
