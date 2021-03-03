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
			FileInputStream fis = new FileInputStream(filePath); //�߻�Ŭ����, ���ڱ���� �Է�
			Reader reader = new InputStreamReader(fis, "UTF-8"); //���ڼ� ���α׷����� ���
			*/
			Reader reader = new FileReader(filePath);

			char[] data = new char[2]; //�ִ� 2���ڱ��� ���� �� ���� -> ������ ũ�Ⱑ ũ�ٸ� �迭�� ũ�⸦ Ű���� �ѹ��� ���� �е���
			int readNum = -1;
			String str = "";
			while((readNum = reader.read(data)) != -1) {
				str += new String(data, 0, readNum); //���ڿ� ���� //readNum -> ���� ���� �� ��ŭ��
				//System.out.println(Arrays.toString(data)); //�����ִ� ����(��) ������ ��ü�� ���ڿ��� �ٲٸ� �ȵ�. => [C, ��}
			}
			System.out.println(str);
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { //���Ͽ� �б� ������ ���ٴ���, 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
