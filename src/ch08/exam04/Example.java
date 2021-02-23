package ch08.exam04;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		//타이어 장착
		myCar.t1 = new KumhoTire(); //t1이 인터페이스 타입이고 KumhoTire가 Car를 implements 하기 때문에 사용 가능
		myCar.t2 = new KumhoTire();
		myCar.t3 = new HankookTire();
		myCar.t4 = new HankookTire();
		
		//달려보자
		myCar.run();

	}

}
