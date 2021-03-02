package ch15.exam05;

import java.io.FileReader;
import java.util.Properties;

//properties
public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		String path = Example.class.getResource("database.properties").getPath();
		prop.load(new FileReader(path)); //상대경로
		//prop.load(new FileReader("C:/Users/ParkVitNa/git/Java/src/ch15/exam05/database.properties")); //절대경로
		//database.properties에서 오른쪽마우스 properties-경로 복사해옴
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		String nation = prop.getProperty("nation");
		System.out.println(nation); //출력은 "대한민국" 그대로 잘 나온다

	}

}
