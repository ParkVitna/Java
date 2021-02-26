package ch15.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("홍길동");
		set.add("감자바");
		set.add("홍길동"); //똑같은건 하나만 저장됨
		set.add("겨울이");
		System.out.println(set.size());
		
		//set은 특정한 하나를 꺼내올 수 없다.
		
		//반복해서 하나씩 꺼내는 방법 밖에 없다.
		for(String item : set) {
			System.out.println(item); //순서가 없음.
		}
		
		//반복 다른 방법
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { //다음으로 가져올 것이 있으면 true
			String item = iterator.next(); //가져왔다고 빼는 건 아니고 가져와서 사용하는 것뿐
			System.out.println(item);
		}
		
		

	}

}
