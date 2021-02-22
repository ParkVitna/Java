package ch06.exam12;

public class Example {

	public static void main(String[] args) { //객체와는 상관없이 사용할 수 있어야해서 static
		// TODO Auto-generated method stub
		//올바른 사용 방법
		System.out.println(Calculator.pi);
		Calculator.plus(3, 5);
		
		//잘못된 사용 방법
		Calculator myCalc = new Calculator();
		System.out.println(myCalc.pi); //에러는 없지만 경고 표시
		myCalc.plus(3, 5); //참조변수를 통해서 접근하지 말아라 (경고 의미)

	}

}
