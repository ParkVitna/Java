package ch18.exam12;

import java.io.IOException;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream os = System.out; //콘솔로 출력 out->err 빨간색으로 출력
		try {
			os.write(65); //System.out.write(65); //같은 것
			os.write(new byte[] {66, 67, 68});
			os.write(new byte[] {66, 67, 68}, 0, 2);
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
