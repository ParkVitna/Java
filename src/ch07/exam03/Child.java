package ch07.exam03;

public class Child extends Parent{
	//Field
	public int field2;
	
	//Constructor
	public Child(String firstName) { //�ڽ�Ŭ������ ����Ǵ��� Ȯ��
		super("��", firstName); //�θ� Ŭ������ �⺻ �����ڰ� ���� �Ű� ������ �ִ� �����ڸ� �ִٸ�
		//super(�Ű���);�� ��������� ȣ���ؾ� �Ѵ� => �ڽ� ������ ù�ٿ� �����
		System.out.println("Child ��ü ����");
	}
	
	//Method
	public void method2() {
		System.out.println("method1() ����");
	}
	
	@Override //������̼�
	public void sound() {
		System.out.println("�Ⱦ��~~~~~");
	}

}
