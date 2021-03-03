package ch18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//outputstreamwriter
public class Example2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam16\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		String data = "오늘은 수요일이다아아아아아악!";
		byte[] bytes = data.getBytes("UTF-8"); //UTF-8 이용, 한글 한글자를 3바이트로 저장
		os.write(bytes);
		os.flush();
		
		data = "오늘은 따뜻해애애애애액!";
		bytes = data.getBytes("UTF-8");
		os.write(bytes);
		os.flush();
		
		os.close();
		*/
		
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam16\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		//Writer writer = new FileWriter(filePath); 쓰면 되지만 어쩔 수 없이 OutputStream을 받아야 하는 경우
		
		String data = "오늘은 수요일이다아아아아악!";
		writer.write(data);
		writer.flush();
		
		data = "오늘은 따뜻해애애애애애애액!";
		writer.write(data);
		writer.flush();
		
		writer.close();

	}

}
