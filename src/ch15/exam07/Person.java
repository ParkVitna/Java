package ch15.exam07;

public class Person implements Comparable { //인테페이스 Comparable 구현
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person temp = (Person) o;
		if(age < temp.age) {
			return -1;
		} else if(age == temp.age) {
			return 0;
		}else {
			return 1;
		}
	
	}
	

}
