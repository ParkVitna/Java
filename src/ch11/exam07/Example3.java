package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Integer var1 = new Integer(500);
		Integer var2 = new Integer(500);
		//������ => false
		//���� �� => true
		*/
		
		/*
		//�ڵ��ڽ̵� ���� �ڽ� �ȴ�. ������ ��� ����
		Integer var1 = 500;
		Integer var2 = 500;
		//������ => false
		//���� �� => true
		*/
		
		//-128 ~127������ ��ü�� ����
		Integer var1 = 10;
		Integer var2 = 10;
		
		System.out.println(var1 == var2); //������ => true ��ü�� �����ؼ� ����� �޶��� �� �ִ�. (���� ������ ���� �ٸ� ��)
		System.out.println(var1.equals(var2)); //���� �� => true �׷��� �̰� ���°� ����.

	}

}
