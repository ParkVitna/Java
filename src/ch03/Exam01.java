package ch03;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��� ����(����, ����, ������)�� �پ��� ����
		
		int var1 = 1;
		var1 = var1 + 1;
		var1 += 1;
		var1++;
		System.out.println("var1: " + var1);
		
		int var2 = 10;
		var2 = var2 - 1;
		var2 -= 1;
		var2--;
		System.out.println("var2: " + var2);
		
		int var3 = 16;
		var3 = var3 / 2;
		var3 /= 2;
		System.out.println("var3: " + var3);
		
		//�ڹٴ� ���� /(������)�� ����� ���� => ��
		int var4 = 11;
		int var5 = 4;
		int var6 = var4 / var5;
		//double var6 = var4 / var5;
		//var4 + var5�� ����� 2 �̸� double�� �ִٺ��ϱ� 2.0
		System.out.println("var6: " + var6);
		
		//double var7 = 1.0 * var4 / var5;
		//11.0 / 4 => �Ǽ� ������ ����
		double var7 = (double)var4 / var5;
		System.out.println("var7: " + var7);
		
		//������ ���ϱ�
		int var8 = var4 % var5; // %�� �������� ���ϴ� ��!
		System.out.println("var8: " + var8);

	}

}
