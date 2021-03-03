package ch18.exam15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/Temp");
		
		String[] list = file.list(); //폴던지 디렉토린지 구분 X
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println();
		
		//파일인지 폴던지 구분, 파일의 크기 알고 싶을 때 -> 파일객체로 받기
		File[] files = file.listFiles(); //파일객체로 받기
		for(File f : files) {
			long time = f.lastModified(); //1970~지금
			Date date = new Date(time); //우리가 아는 날짜로 변경
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm"); //Date형식 지정
			System.out.print(sdf.format(date));
			
			if(f.isDirectory()) { //디렉토리냐?
				System.out.print("\t<dir>\t");
			} else {
				System.out.print("\t" + f.length() + "\t"); //폴더에는 length() 할 수 없음
			}
			System.out.println(f.getName());
		}

	}

}
