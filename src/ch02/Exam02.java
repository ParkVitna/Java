package ch02;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڵ� Ÿ�� ��ȯ
		byte var1 = 10;
		int var2 = var1; //1byte�� 4byte�� ���� ��
		System.out.println("var2: " + var2);
		
		//���� Ÿ�� ��ȯ -> ���� ���� �����Ǵ� �������� �ؾ� �ǹ̰� �ִ� ��
		int var3 = 1000;
		byte var4 = (byte)var3; //4byte�� 1byte�� ���� �� 
								//(byte)������ �ɰ��ڴ� 4��п��� ������ ����
		System.out.println("var4: " + var4);
		
		//-----------------------------------------
		
		//�ڵ� Ÿ�� ��ȯ -> ������ �Ǽ����� �׻� ���� ����
		long var5 = 10;
		float var6 = var5;
		
		//���� Ÿ�� ��ȯ -> �Ǽ��� �������� �׻� ū ����
		float var7 = 10.5f;
		long var8 = (long)var7; //�Ҽ����� �ڸ��� �����ٴ� ��
		
		//-----------------------------------------
		
		//�Ǽ��� ������ ��ȯ
		double var9 = 3.14;
		int var10 = (int)var9;

	}

}
