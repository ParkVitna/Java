package ch06.exam11;

public class User {
	//Field (�����͸� ����)
	//�ν��Ͻ� �ʵ� ����
	String id;
	String name;
	String password;
	static String nation = "�ѱ�"; //��ü�� ������ �ʾƵ� ����� �� ����
	
	//Constructor
	User(String name){
		this.name = name;
		//��ü ������ �� �ʵ� (static ����) �� ����
	}
	
	
	//Method
	//�ν��Ͻ� �޼ҵ� -> �� �ȿ����� �ν��Ͻ��� ��밡��
	static void info() {
		//name = "ȫ�浿"; name�� ��ü �ȿ� �����ϱ� ������ ��ü�� �־�߸� �� �� �����Ƿ� ������
		//this �� �� ���� -> this�� ��ü �ڱ��ڽ�. ��ü�� �־�߸� �� �� �����Ƿ� ������
		nation = "���ѹα�";
		System.out.println("��� User�� �ѱ��� �Դϴ�.");
	}
	
	void login() {
		System.out.println(name + "���� �α��� �մϴ�."); //�ʵ��� name ����ϰ� ���� -> ��ü�� �־�� �� �� ����.
	}
	
	void logout() {
		System.out.println(name + "���� �α׾ƿ� �մϴ�.");
	}


}
