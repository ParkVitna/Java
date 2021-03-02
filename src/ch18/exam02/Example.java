package ch18.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "C:/Users/ParkVitNa/git/Java/src/ch18/exam02/data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			
			byte[] data = new byte[3]; //3바이트씩
			
			//방법1
			/*while(true) {
				int readNum = is.read(data); //읽은 수
				if(readNum == -1) {
					break;
				}
				System.out.println(readNum + ": " + Arrays.toString(data));
			}*/
			
			//방법2 -> 많이 사용함
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {
				System.out.println(readNum + ": " + Arrays.toString(data));
			}
			
			is.close();
			
			/*int readNum = is.read(data); //읽은 수
			System.out.println(readNum + ": " + Arrays.toString(data)); //ABC
			
			readNum = is.read(data); //읽은 수
			System.out.println(readNum + ": " + Arrays.toString(data));//DE + 이전에 읽은 67이 남아있는 것
			
			readNum = is.read(data); //읽은 수
			System.out.println(readNum + ": " + Arrays.toString(data)); //바이트를 더 이상 읽을 수 없다면 -1 리턴
			*/			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
