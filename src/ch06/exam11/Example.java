package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ν��Ͻ� ���(�ʵ�, �޼ҵ�)�� �ݵ��
		//��ü ���� ������ ���ؼ� ���� (�ݵ�� ��ü ����!)
		
		User user = new User("ȫ�浿");
		//User user = null; -> NullPointException ���� �߻� (��ü�� ���� ���¿��� ���)
		
		System.out.println(user.name);
		user.login();
		user.logout();
		
		//���� ���(�ʵ�. �޼ҵ�)�� ��ü�� ��� ��밡��
		System.out.println(User.nation);
		User.info();
		

	}

}
