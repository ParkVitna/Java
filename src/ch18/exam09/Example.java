package ch18.exam09;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam09\\data.txt";
		try {
			Writer writer = new FileWriter(filePath);

			writer.write(new char[] {'A', '��'}); //�Ű������� Ÿ���� �����ϰ� ����Ͽ��� �Ѵ�. 
			writer.write(new char[] {'B', '��', 'C', 'D'}, 0, 2);
			writer.write("������ ������ ȭâ�մϴ�.");
			
			writer.flush();
			
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { //���Ͽ� �б� ������ ���ٴ���, 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}