package ch11.exam01;
//객체비교 equls

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("Winter", "늦겨울");
		Member m2 = new Member("Winter", "늦겨울");
		
		System.out.println(m1 == m2); //false
		System.out.println(m1.equals(m2)); //false -> object이 가지고 있는 equals는 번지비교
		//재정의하고 나면 true
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	
	}


}
