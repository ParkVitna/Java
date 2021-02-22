package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Korean.NATION);
		//Korean.NATION = "미국"; //final 있으면 내용을 바꿀 수 없음
		
		Korean k1 = new Korean("123456-1234567");
		//k1.ssn = "666422-1234556"; //(X) final 있으면 내용을 바꿀 수 없음
		
		System.out.println(Math.PI); // PI 는 static final로 정의되어 있음
		double area = 10 * 10 * Math.PI;
		
	}

}
