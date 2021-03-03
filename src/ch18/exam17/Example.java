package ch18.exam17;
//버퍼이용시 성능비교
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filePath1 = "D:/Team4Projects/Java/src/ch18/exam17/photo.jpg";
		String filePath2 = "D:/Team4Projects/Java/src/ch18/exam17/photo2.jpg";
		String filePath3 = "D:/Team4Projects/Java/src/ch18/exam17/photo3.jpg";
		
		//버퍼안씀
		InputStream is1 = new FileInputStream(filePath1);
		OutputStream os1 = new FileOutputStream(filePath2);
		copy(is1, os1);
		is1.close();
		os1.close();
		
		//버퍼씀 <- 보조스트림을 달아서
		InputStream is2 = new FileInputStream(filePath1);
		BufferedInputStream bis = new BufferedInputStream(is2);
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath1)); -> 이렇게 줄일 수 있다.
		
		OutputStream os2 = new FileOutputStream(filePath3);
		BufferedOutputStream bos = new BufferedOutputStream(os2);
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath3));
		
		copy(bis, bos);
		bis.close(); //보조스트림이 close()되면 연결되어 있는 주스트림도 자동으로 close()됨.
		bos.close();
		/* 따라서 생략가능
		is2.close();
		os2.close();
		*/
		
		

	}
	
	public static void copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		int data = -1; //순수하게 버퍼이용시 성능비교를 위해 바이트 배열 안씀
		while((data=is.read()) != -1) {
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		System.out.println("복사 시간: " + (end - start) + "ns");
	}

}
