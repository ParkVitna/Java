package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Korean.NATION);
		//Korean.NATION = "�̱�"; //final ������ ������ �ٲ� �� ����
		
		Korean k1 = new Korean("123456-1234567");
		//k1.ssn = "666422-1234556"; //(X) final ������ ������ �ٲ� �� ����
		
		System.out.println(Math.PI); // PI �� static final�� ���ǵǾ� ����
		double area = 10 * 10 * Math.PI;
		
	}

}
