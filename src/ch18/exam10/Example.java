package ch18.exam10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

//카피프로그램 -> 어제 했던 input output으로 하는 게 정상이지만 한번 해본다.
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath1 = "D:\\Team4Projects\\Java\\src\\ch18\\exam10\\data.txt";
		String filePath2 = "D:\\Team4Projects\\Java\\src\\ch18\\exam10\\data2.txt";
		
		try {
			Reader reader = new FileReader(filePath1);
			Writer writer = new FileWriter(filePath2);
			
			char[] data = new char[1024]; //2048바이트, 1024문자
			int readNum = -1;
			
			while((readNum = reader.read(data)) != -1) {
				writer.write(data, 0, readNum); //중요!
			}
			
			writer.flush();

			reader.close();
			writer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
