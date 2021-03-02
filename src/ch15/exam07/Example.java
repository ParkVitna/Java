package ch15.exam07;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//Compareable
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> set = new TreeSet<>();
		
		set.add(new Person("홍길동",27)); //Person에서 implements Comparable -> 비교할 수 있는 객체가 되도록 인터페이스
		set.add(new Person("감자바",30));
		set.add(new Person("박자바",28));
		
		for(Person p : set) {
			System.out.println(p.name + ", " + p.age);
		}
		
		System.out.println();
		
		TreeMap<Person, Integer> map = new TreeMap<>();
		map.put(new Person("홍길동",27), 95);
		map.put(new Person("김자바",30), 80);
		map.put(new Person("박자바",28), 90);
		
		Set<Person> keys = map.keySet();
		for(Person p : keys) {
			System.out.println(p.name + ", " + p.age + ": " + map.get(p));
		}
		

	}

}
