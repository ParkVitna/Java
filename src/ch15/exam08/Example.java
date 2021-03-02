package ch15.exam08;
//�츮�� ���� Ŭ������ �ƴ϶�� �������� ��, implements Comparable�� ���� �ʰ� ����ϴ� ���
//TreeSet(Comparator<? super E> comparator)

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�͸�������ü Comparator�������̽��� ������ Ŭ������ �����~
		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() { //���� �� �ֵ��� Comparator ����
			//Comparator�� ���� �ִ� �޼ҵ� ������
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
		
		TreeMap<Product, String> map = new TreeMap<>(new Comparator<Product>() { //���� �� �ֵ��� Comparator ����
			//Comparator�� ���� �ִ� �޼ҵ� ������
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
		map.put(new Product("Audio", 5000), "�Ｚ");
		map.put(new Product("Car", 12000), "Hyundai");
		
		Set<Product> pset = map.keySet();
		
		for(Product p : pset) {
			System.out.println(p.name + ", " + p.price + ", " + map.get(p));
		}

	}

}