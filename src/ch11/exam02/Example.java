package ch11.exam02;

import java.util.Date;

import ch11.exam01.Member;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object var1 = new Object();
		System.out.println(var1.toString());
		
		//������ �� ����� ���´�
		
		Date var2 = new Date(); //java.util.Date import �ϱ�
		System.out.println(var2.toString());
		
		String var3 = "abc";
		System.out.println(var3.toString());
		
		Member var4 = new Member("Winter", "�ʰܿ�");
		System.out.println(var4.toString());
		System.out.println(var4); //�� ������ ����� �Ȱ�����?
		//println�� ���������� toString�� ȣ���Ѵ�.
		
		String result = var4 + " => spring: ������"; // ���) winter: �ʰܿ� => spring: ������
		System.out.println(result);
		//var4 �̷��� ��ü�� �־����� �ڵ����� toString�� ȣ��Ǽ� +���� �Ѵ�.

	}

}
