package ch15.exam05;

import java.io.FileReader;
import java.util.Properties;

//properties
public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		String path = Example.class.getResource("database.properties").getPath();
		prop.load(new FileReader(path)); //�����
		//prop.load(new FileReader("C:/Users/ParkVitNa/git/Java/src/ch15/exam05/database.properties")); //������
		//database.properties���� �����ʸ��콺 properties-��� �����ؿ�
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		String nation = prop.getProperty("nation");
		System.out.println(nation); //����� "���ѹα�" �״�� �� ���´�

	}

}
