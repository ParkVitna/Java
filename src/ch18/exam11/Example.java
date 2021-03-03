package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

//콘솔
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream is = System.in; //System.in.read(); //in이 참조하는 번지로 가서 read()실행 //같은 것
			while(true) {
				int keyCode = is.read(); //무조건 1바이트만 읽을 수 있기 때문에 한글을 읽을 수 없다.
				System.out.println(keyCode);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
