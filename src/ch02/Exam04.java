package ch02;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڿ� => ����(����, �Ǽ�)�� ��ȯ
		
		//���ڿ��� String Ÿ�� ������ �����Ѵ�.
		String var1 = "10"; //���ڿ��� ū����ǥ
		System.out.println("var1: " + var1); //���ڿ� 10 ���
		
		//���ڿ��� ���ڰ� +������ �Ǹ� ���ڿ� ����
		String var2 = var1 + 5;
		System.out.println("var2: " + var2); //����� : 105 => "10" + "5" ���ڿ��� ����
		
		//���ڿ��� ������ �����ؼ� ����
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println("var3: " + var3);
		
		//���ڿ��� �Ǽ��� �����ؼ� ����
		String var4 = "10.5";
		double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println("var5: " + var5);
		
		//���ڸ� ���ڿ��� ��ȯ
		int var6 = 3;
		//���1 - ���ڿ� ���� ������ ��Ų��.
		String var7 = "" + var6; //���ڿ� "3"
		//���2 - ���ڸ� ���ڿ��� ��ȯ
		String var8 = String.valueOf(var6);
		

	}

}
