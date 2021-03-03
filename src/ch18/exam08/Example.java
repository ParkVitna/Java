package ch18.exam08;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam08\\data.txt";
		try {
			/*
			FileInputStream fis = new FileInputStream(filePath); //추상클래스, 문자기반의 입력
			Reader reader = new InputStreamReader(fis, "UTF-8"); //문자셋 프로그램에서 명시
			*/
			Reader reader = new FileReader(filePath);

			char[] data = new char[2]; //최대 2문자까지 읽을 수 있음 -> 파일의 크기가 크다면 배열의 크기를 키워서 한번에 많이 읽도록
			int readNum = -1;
			String str = "";
			while((readNum = reader.read(data)) != -1) {
				str += new String(data, 0, readNum); //문자열 결합 //readNum -> 읽은 문자 수 만큼만
				//System.out.println(Arrays.toString(data)); //남아있는 문자(글) 때문에 전체를 문자열로 바꾸면 안됨. => [C, 글}
			}
			System.out.println(str);
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { //파일에 읽기 권한이 없다던지, 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
