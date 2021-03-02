package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

//TreeSet
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		//검색과 기능과 관련된 메소드가 TreeSet애 선언되어 있기 때문에 Set<String> set = new TreeSet<String>();으로 받지 않았다.
		//자식객체를 부모타입으로 받으면 부모의 메소드만 쓸 수 있음
		
		set.add("박길순");
		set.add("홍길동");
		set.add("방돌이");
		set.add("감자바");
		
		for(String item : set) {
			System.out.println(item);
		}
		
		System.out.println();
		
		
		//올림차순이 아니라 내림차순으로 하고 싶을 때 descendingSet() or descendingIterator()
		NavigableSet<String> nset = set.descendingSet(); //TreeSet에만 있는 메소드
		
		for(String item : nset) {
			System.out.println(item);
		}
		
		System.out.println();
		
		NavigableSet<String> sset = set.subSet("가", false, "방돌이", true);
		
		for(String item : sset) {
			System.out.println(item);
		}
		

	}

}
