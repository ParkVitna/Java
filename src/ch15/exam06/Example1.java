package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

//TreeSet
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		//�˻��� ��ɰ� ���õ� �޼ҵ尡 TreeSet�� ����Ǿ� �ֱ� ������ Set<String> set = new TreeSet<String>();���� ���� �ʾҴ�.
		//�ڽİ�ü�� �θ�Ÿ������ ������ �θ��� �޼ҵ常 �� �� ����
		
		set.add("�ڱ��");
		set.add("ȫ�浿");
		set.add("�浹��");
		set.add("���ڹ�");
		
		for(String item : set) {
			System.out.println(item);
		}
		
		System.out.println();
		
		
		//�ø������� �ƴ϶� ������������ �ϰ� ���� �� descendingSet() or descendingIterator()
		NavigableSet<String> nset = set.descendingSet(); //TreeSet���� �ִ� �޼ҵ�
		
		for(String item : nset) {
			System.out.println(item);
		}
		
		System.out.println();
		
		NavigableSet<String> sset = set.subSet("��", false, "�浹��", true);
		
		for(String item : sset) {
			System.out.println(item);
		}
		

	}

}
