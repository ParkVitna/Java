package ch18.exam15;

import java.io.File;

//File Ŭ����
public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:/Temp/data.txt");
		if(!file.exists()) {
			file.createNewFile(); //���� ���� ���ϸ� �������
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3");
		if(!file.exists()) {
			//file.mkdir();
			file.mkdirs(); //��λ��� ���� ��� ���丮 ����
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.exists()) {
			file.delete();
		}
		
		file = new File("C:/Temp/dir1/dir2/dir3"); //'dir3�� �����ض�'�� �ǹ�
		if(file.exists()) {
			file.delete();
		}

	}

}
