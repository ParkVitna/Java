package ch07.exam01;

public class Example {

	public static void main(String[] args) {
		
		Child child = new Child(); //=> 자식객체만 생성해도 부모객체도 생성됨
		child.field1 = 10; //부모 필드 사용 가능
		child.field2 = 10;
		child.method1(); //부모 메소드 사용 가능
		child.method2();

	}

}
