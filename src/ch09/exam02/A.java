package ch09.exam02;
//중첩 클래스
public class A {
	//인스턴스 멤버 클래스
	public class B {
		public int field;
		public B() {}
		public void method() {}
	}
	
	//정적 멤버 클래스
	static class C {
		public int field;
		public C() {}
		public void method() {}
	}
	
	//로컬 클래스
	public void method() {
		class D{ //접근자를 쓸 수 없음
			public int field;
			public D() {}
			public void method() {}
		}
		
		D d = new D();
		d.field = 3;
		d.method();
	}

}
