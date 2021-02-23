package ch07.exam11;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal(); //추상클래스는 객체 생성할 수 없다.
		
		//부모 = 자식객체 대입 가능
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		animal1.eat();
		animal1.sleep();
		animal1.sound(); //멍멍
		
		animal2.eat();
		animal2.sleep();
		animal2.sound(); //야옹

	}

}
