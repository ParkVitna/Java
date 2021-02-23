package ch07.exam05;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SportsCar sc = new SportsCar();
		sc.run(); //자식에서 재정의 된 것
		sc.stop(); // final 이므로 무조건 부모꺼

	}

}
