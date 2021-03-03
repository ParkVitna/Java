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
			FileInputStream fis = new FileInputStream(filePath); //�߻�Ŭ����, ���ڱ���� �Է�
			Reader reader = new InputStreamReader(fis, "UTF-8"); //���ڼ� ���α׷����� ���
			*/
			Reader reader = new FileReader(filePath);
			
			//���1
			/*while(true) {
				int charCode = reader.read();
				if(charCode == -1) {
					break;
				}
				char charData = (char)charCode;
				System.out.println(charCode + ": " + charData);
			}*/
			
			//���2 -> �� �Ⱦ�
			int charCode = -1;
			while((charCode = reader.read()) != -1) {
				char charData = (char)charCode;
				System.out.println(charCode + ": " + charData);
			}
			
			reader.close();
			
			/*charCode = reader.read(); //���콺 ������ Add Catch Ŭ�� -> IOException e
			charData = (char)charCode;
			System.out.println(charData);*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { //���Ͽ� �б� ������ ���ٴ���, 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
