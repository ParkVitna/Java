package ch07.exam03;

public class Example {

	public static void main(String[] args) {
		
		Child child = new Child("길동"); //=> 자식객체만 생성해도 부모객체도 생성됨
		System.out.println(child.firstName); //=>길동
		System.out.println(child.lastName); //=>김
		child.sound(); // =>싫어요~~~ 자식이 갖고 있는 메소드가 호출

	}

}
