package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:/Users/ParkVitNa/git/Java/src/ch18/exam01/data.txt";
		try {
			InputStream is = new FileInputStream(filePath); //에러난 부분에 마우스 올려서 surround try-catch 클릭
			//방법1
			/*
			  while(true) {
				int data = is.read();
				if(data == -1) { //데이터가 없다면 빠져나옴
					break;
				}
				System.out.println(data);
			}
			*/	
			
			//방법2
			int data = -1;
			while((data = is.read()) != -1) { //read() 메소드는 입력스트림으로부터 1바이트를 읽고 4바이트 int타입으로 리턴 => □□□■ (1바이트 읽었을 때, int의 4바이트)
				System.out.print(data);
			}
			
			is.close(); //사용이 끝난 파일은 닫아줘야함. 닫지 않으면 다른 프로그램이 사용을 못함.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
