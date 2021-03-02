package ch15.exam04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//map�÷���
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map ����
		Map<String, String> map = new HashMap<>();
		
		//Entry ����
		map.put("s1", "ȫ�浿");
		map.put("s2", "���ڹ�");
		map.put("s3", "������");
		
		System.out.println(map.size());
		
		//Ű�� �� ��������
		String s1 = map.get("s1");
		System.out.println(s1);
		
		//�ݺ� ó�� - ���1
		Set<Entry<String, String>> set = map.entrySet(); //map �ȿ� �ִ� ��Ʈ���� set ������ ��ȯ 
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		//�ݺ� ó�� - ���2
		Set<String> set2 = map.keySet();
		for(String key : set2) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		//Entry ����
		map.remove("s1");
		map.clear();
		

	}

}
