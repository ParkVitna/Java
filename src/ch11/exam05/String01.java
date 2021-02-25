package ch11.exam05;

import java.util.Arrays;

//String Ŭ����
public class String01 {

	public static void main(String[] args) { //throws Exception �ϸ� �ؿ� try-catch ���ְ�, JVM���� ����ó�� ���ѱ�
		// TODO Auto-generated method stub
		byte[] arr1 = {65, 66, 67}; //byte�迭�� ���ڿ��� ����� ����
		String str1 = new String(arr1);
		System.out.println(str1); //ABC -> 65 66 67�� �ǹ�
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2)); //Ŭ����Arrays.�޼ҵ�toString -> �迭�� �ִ� �׸��� �о �ϳ��� ���ڿ��� 
		
		try {
			String str3 = "������";
			//�������� � �� ����ߴ��Ŀ� ���� �迭�� ���̰� �޶���
			byte[] arr31 = str3.getBytes("EUC_KR"); //���ڼ��� ��, �ѱ� �ѱ��ڸ� 2����Ʈ�� ǥ�� -> ����� �ѱ۸� ����
			byte[] arr32 = str3.getBytes("UTF-8"); //�ѱ� �ѱ��ڸ� 3����Ʈ�� ǥ�� -> ������� ����. �����蹮�ڱ⺻��¼��
			System.out.println(Arrays.toString(arr31));
			System.out.println(Arrays.toString(arr32));
			
			String str4 = new String(arr31, "EUC-KR"); //������ ���� �Ȱ��� ���ڼ� �����
			String str5 = new String(arr32, "UTF-8");
			System.out.println(str4);
			System.out.println(str5);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
