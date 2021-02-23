package ch07.exam07;

public class Example {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;
		//Parent parent = new Child();
		parent.method1();
		parent.method2(); // =>자식 쪽의 재정의한 걸로 실행
		//parent.method3(); -> Parent에 있는 것만 실행 가능 (부모타입으로 사용하고 있기 때문)
		
	}

}
