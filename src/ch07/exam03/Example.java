package ch07.exam03;

public class Example {

	public static void main(String[] args) {
		
		Child child = new Child("�浿"); //=> �ڽİ�ü�� �����ص� �θ�ü�� ������
		System.out.println(child.firstName); //=>�浿
		System.out.println(child.lastName); //=>��
		child.sound(); // =>�Ⱦ��~~~ �ڽ��� ���� �ִ� �޼ҵ尡 ȣ��

	}

}
