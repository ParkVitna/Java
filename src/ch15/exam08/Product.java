package ch15.exam08;
//우리가 만든 클래스가 아니라고 가정했을 때, implements Comparable을 쓰지 않고 사용하는 방법
//TreeSet(Comparator<? super E> comparator)
public class Product {
	public String name;
	public int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

}
