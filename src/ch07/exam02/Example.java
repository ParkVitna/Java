package ch07.exam02;

public class Example {

	public static void main(String[] args) {
		
		Child child = new Child("�浿"); //=> �ڽİ�ü�� �����ص� �θ�ü�� ������
		System.out.println(child.firstName); //=>�浿
		System.out.println(child.lastName); //=>��
		child.method1(); //�θ� �޼ҵ� ��� ����
		child.method2();

	}

}
