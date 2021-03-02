package ch15.exam04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//map컬랙션
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map 생성
		Map<String, String> map = new HashMap<>();
		
		//Entry 저장
		map.put("s1", "홍길동");
		map.put("s2", "감자바");
		map.put("s3", "개발자");
		
		System.out.println(map.size());
		
		//키의 값 가져오기
		String s1 = map.get("s1");
		System.out.println(s1);
		
		//반복 처리 - 방법1
		Set<Entry<String, String>> set = map.entrySet(); //map 안에 있는 엔트리를 set 안으로 변환 
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		//반복 처리 - 방법2
		Set<String> set2 = map.keySet();
		for(String key : set2) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		//Entry 삭제
		map.remove("s1");
		map.clear();
		

	}

}
