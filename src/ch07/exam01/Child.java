package ch07.exam01;

public class Child extends Parent{
	//Field
	public int field2;
	
	//Constructor
	public Child() { //�ڽ�Ŭ������ ����Ǵ��� Ȯ��
		//super(); �θ�ü�� ���� �����ϰ� �ڽİ�ü ������.
		//super()�� �����Ǿ� ������ �����Ϸ��� �⺻������ �־���
		System.out.println("Child ��ü ����");
	}
	
	//Method
	public void method2() {
		System.out.println("method1() ����");
	}

}
