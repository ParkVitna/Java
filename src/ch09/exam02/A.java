package ch09.exam02;
//��ø Ŭ����
public class A {
	//�ν��Ͻ� ��� Ŭ����
	public class B {
		public int field;
		public B() {}
		public void method() {}
	}
	
	//���� ��� Ŭ����
	static class C {
		public int field;
		public C() {}
		public void method() {}
	}
	
	//���� Ŭ����
	public void method() {
		class D{ //�����ڸ� �� �� ����
			public int field;
			public D() {}
			public void method() {}
		}
		
		D d = new D();
		d.field = 3;
		d.method();
	}

}
