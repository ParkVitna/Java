package ch06.exam04;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Korean k1 = new Korean(); 매게변수 값 제공 안해서 오류
		Korean k1 = new Korean("김자바", "654321-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("김자바", "654321-1234567");
		System.out.println(k2.name);
		System.out.println(k2.ssn);

	}

}
