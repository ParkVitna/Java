package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���α׷� ���� �뵵�� ���
		
		Student s1 = new Student(); //��ü ����
		//Ŭ���� Ÿ���� ������ �����ϰ� ��ü�� ��ġ(����)�� ����
		Student s2 = new Student();
		Student s3= s1; //�����ϴ� ��ü�� ������.
		
		if(s1 == s2) { //���� �� -> ���ٸ� ���� ��ü�� �����Ѵٴ� �ǹ� => false
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}

	}

}
