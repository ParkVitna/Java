package ch11.exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10;
		// �� �Ʒ��� ������ �ٸ� ��
		Integer var2 = new Integer(10); //(��������) ���� = ���� �� ����
		Integer var3 = 10; //�ڵ����� ��Ƽ�� Ÿ�� ������ ������� -> Auto Boxing
		
		double var4 = 3.5; //�� ����
		Double var5 = new Double(3.5); //���� ����
		Double var6 = 3.5; //Auto Boxing
		
		Integer var7 = new Integer(10); //10�� ���� var8�� �����ϰ� �ʹ�.
		int var8 = var7.intValue(); //var7�ȿ� 10�� ������� var8�� ����
		int var9 = var7; //var7�� �������� -> Auto UnBoxng
		
		Double var10 = new Double(3.5);
		double var11 = var10.doubleValue(); //���� ���
		double var12 = var10; //��� ���������� var12�� �� �� �ֳ� -> Auto UnBoxing
		//-> �̷� ���尴ü�� �⺻Ÿ�Կ� ������ �ϰ� �Ǹ� �ڵ������� �ڽ��� Ǯ���� �ȿ� �ִ� ���� ����ȴ�.
		
		Object[] arr = new Object[5]; //Object�� ��� ��ü�� �θ� ���� �ڽİ�ü�� Object�� Ÿ�Ժ�ȯ �� �� ����
		arr[0] = "abc";
		arr[1] = 10; //Auto Boxing ������ ������ ���� �Ǵµ�(��ü�� ��������� ���� �Ǵµ�)
		arr[2] = true; //Auto Boxing

	}

}
