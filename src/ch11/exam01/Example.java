package ch11.exam01;
//��ü�� equls

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("Winter", "�ʰܿ�");
		Member m2 = new Member("Winter", "�ʰܿ�");
		
		System.out.println(m1 == m2); //false
		System.out.println(m1.equals(m2)); //false -> object�� ������ �ִ� equals�� ������
		//�������ϰ� ���� true
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	
	}


}
