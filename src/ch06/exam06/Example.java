package ch06.exam06;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Korean k1 = new Korean(); 매게변수 값 제공 안해서 오류
		Korean k1 = new Korean();
		Korean k2 = new Korean("김소라");
		Korean k3 = new Korean("김소라", "123456-7890123");
		Korean k4 = new Korean("김소라", "123456-7890123", 25);

	}

}
