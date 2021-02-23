package ch07.exam02;

public class Example {

	public static void main(String[] args) {
		
		Child child = new Child("길동"); //=> 자식객체만 생성해도 부모객체도 생성됨
		System.out.println(child.firstName); //=>길동
		System.out.println(child.lastName); //=>김
		child.method1(); //부모 메소드 사용 가능
		child.method2();

	}

}
