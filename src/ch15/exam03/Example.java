package ch15.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("ȫ�浿"); //�Ȱ����� �ϳ��� �����
		set.add("�ܿ���");
		System.out.println(set.size());
		
		//set�� Ư���� �ϳ��� ������ �� ����.
		
		//�ݺ��ؼ� �ϳ��� ������ ��� �ۿ� ����.
		for(String item : set) {
			System.out.println(item); //������ ����.
		}
		
		//�ݺ� �ٸ� ���
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { //�������� ������ ���� ������ true
			String item = iterator.next(); //�����Դٰ� ���� �� �ƴϰ� �����ͼ� ����ϴ� �ͻ�
			System.out.println(item);
		}
		
		

	}

}
