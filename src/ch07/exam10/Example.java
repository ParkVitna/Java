package ch07.exam10;

public class Example {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.field1 = 5;
		parent.method1();
		parent.method2(); //자식객체에서 재정의된 method2 호출
		
		Child child = (Child) parent; //강제 타입 변환
		child.field1 = 5;
		child.method1();
		child.method2();
		child.field2 = 5; //자식 타입에 선언된 필드와 메소드 사용 가능
		child.method3();
		
		
		 
	}

}
