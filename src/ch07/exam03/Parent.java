package ch07.exam03;

public class Parent {
	//Field
	public String lastName;
	public String firstName;
	
	//Constructor
	public Parent(String lastName, String fristName) { //�θ�Ŭ������ ����Ǵ��� Ȯ��
		System.out.println("Parent ��ü ����");
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	//Method
	public void sound() {
		System.out.println("�����ض�~~~~~");
	}

}
