package ch18.exam05;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:/Users/ParkVitNa/git/Java/src/ch18/exam05/data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte[] arr = {65, 66, 67};
			os.write(arr); //다 보내는 것
			os.write(arr, 0, arr.length); //위와 똑같음
			os.flush();
			os.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
