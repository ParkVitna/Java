package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

//ArrayList
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		//��ü ����
		list.add("ȫ�浿"); //String ��ü
		list.add(3); //Integer��ü�� �ڽ��� �Ǿ ����
		list.add(new Board()); //� ��ü�� ������ �� �� �ִ�
		System.out.println(list.size()); //����� ������ ���
		
		//��ü ���
		//String name = list.get(0); //ObjectŸ��(�θ�)�� StringŸ��(�ڽ�)���� ������ �� ����.
		String name = (String) list.get(0); //����Ÿ�Ժ�ȯ
		int value = (Integer) list.get(1); //Object�� Integer�� Ÿ�Ժ�ȯ�ؼ� �����ڽ�
		Board board = (Board) list.get(2);
		//����� Ÿ���� �𸣸� Ÿ�Ժ�ȯ�� �� ��� �� �� ����. -> �� ���� ����
		
		//�߾��� ��� -> exam02
		
		//��ü ����
		list.remove(0); //ȫ�浿 ����
		list.remove(0); //3���� -> ��ܿ��� ������
		System.out.println(list.size());
		
		
		

	}

}
