package ch06homework.exam08;

public class Calculator03Example {
	public static void main(String[] args) {

		Calculator03 myCalcu = new Calculator03();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형의 넓이=" + result1);
		System.out.println("직사각형의 넓이=" + result2);
		
	}
	

}
