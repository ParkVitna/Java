package ch18.exam07;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam07\\data.txt";
		try {
			/*
			FileInputStream fis = new FileInputStream(filePath); //추상클래스, 문자기반의 입력
			Reader reader = new InputStreamReader(fis, "UTF-8"); //문자셋 프로그램에서 명시
			*/
			Reader reader = new FileReader(filePath);
			
			//방법1
			/*while(true) {
				int charCode = reader.read();
				if(charCode == -1) {
					break;
				}
				char charData = (char)charCode;
				System.out.println(charCode + ": " + charData);
			}*/
			
			//방법2 -> 잘 안씀
			int charCode = -1;
			while((charCode = reader.read()) != -1) {
				char charData = (char)charCode;
				System.out.println(charCode + ": " + charData);
			}
			
			reader.close();
			
			/*charCode = reader.read(); //마우스 오른쪽 Add Catch 클릭 -> IOException e
			charData = (char)charCode;
			System.out.println(charData);*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { //파일에 읽기 권한이 없다던지, 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
