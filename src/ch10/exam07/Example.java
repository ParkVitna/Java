package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method(); //ȣ���� ��
		}catch (Exception e){
			//���� �޽��� ���� ����ó���� �� ��
			String message = e.getMessage();
			System.out.println(message);
			
			//������� �� ����� �� �ִ� ���� ���� -> ���� �� �ϰ� ������ ������ ��
			System.out.println(e.toString()); //������ ���ڿ��� �� => ch10.exam07.NoAccountException: �Ա� ���°� ����
			e.printStackTrace(); // => ch10.exam07.NoAccountException: �Ա� ���°� ����
								//at ch10.exam07.Example.method(Example.java:22)
								//at ch10.exam07.Example.main(Example.java:8)
		}
		
	}

	public static void method() throws NoAccountException { //���� �߻���Ų �޼ҵ忡�� ���� ���ѱ�� �ؾ��� -> ȣ���� ������ ����ó��
		throw new NoAccountException("�Ա� ���°� ����"); //���� �߻���Ű��
		
	}

}
