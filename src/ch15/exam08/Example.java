package ch15.exam08;
//우리가 만든 클래스가 아니라고 가정했을 때, implements Comparable을 쓰지 않고 사용하는 방법
//TreeSet(Comparator<? super E> comparator)

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명구현객체 Comparator인터페이스를 구현한 클래스를 만들고~
		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() { //비교할 수 있도록 Comparator 제공
			//Comparator가 갖고 있는 메소드 재정의
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price < o2.price) {
					return -1;
				}else if(o1.price == o2.price) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		set.add(new Product("TV", 10000));
		set.add(new Product("Audio", 5000));
		set.add(new Product("Car", 12000));
		
		for(Product p : set) {
			System.out.println(p.name + ", " + p.price);
		}
		
		System.out.println();
		
		TreeMap<Product, String> map = new TreeMap<>(new Comparator<Product>() { //비교할 수 있도록 Comparator 제공
			//Comparator가 갖고 있는 메소드 재정의
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price < o2.price) {
					return -1;
				}else if(o1.price == o2.price) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		map.put(new Product("TV", 10000), "LG");
		map.put(new Product("Audio", 5000), "삼성");
		map.put(new Product("Car", 12000), "Hyundai");
		
		Set<Product> pset = map.keySet();
		
		for(Product p : pset) {
			System.out.println(p.name + ", " + p.price + ", " + map.get(p));
		}

	}

}
