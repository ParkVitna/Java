package ch18.exam06;
//copy program
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath1 = "C:/Users/ParkVitNa/git/Java/src/ch18/exam06/photo2.jpg";
		String filePath2 = "C:/Users/ParkVitNa/git/Java/src/ch18/exam06/photo3.jpg";
		
		try {
			InputStream is = new FileInputStream(filePath1);
			OutputStream os = new FileOutputStream(filePath2);
			
			byte[] data = new byte[1024];
			int readNum = -1; //파일이 0바이트 일 수 도 있으니까 파일이 없다는 걸 -1로 초기화
			while((readNum = is.read(data)) != -1) {
				os.write(data, 0, readNum); //index 0부터 읽은 수 만큼만 보내면 됨.
			}
			os.flush();
			
			is.close();
			os.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
