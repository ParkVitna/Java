package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int result1 = Singleton.method1();
		String result2 = Singleton.mathod2();
		int[] result3 = Singleton.method3();
		*/
		
		//�����ڸ� �̿��ؼ� ��ü ���
		//Singleton result1 = new Singleton(); (X) private ������ �ȵ�
		
		//Factory Method �̿��ؼ� ��ü ���
		Singleton result2 = Singleton.getInstance();
		Singleton result3 = Singleton.getInstance();
		if(result2 ==  result3) {
			System.out.println("���� ��ü�� ����"); // => ���
		}else {
			//�޼ҵ忡��
			//Singleton s = new Singleton();
			//return s;
			System.out.println("�ٸ� ��ü�� ����"); // => �޼ҵ� �ȿ��� ȣ��� ������ ��ü ����
		}
		
	}
	
}
