package ch18.exam15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/Temp");
		
		String[] list = file.list(); //������ ���丰�� ���� X
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println();
		
		//�������� ������ ����, ������ ũ�� �˰� ���� �� -> ���ϰ�ü�� �ޱ�
		File[] files = file.listFiles(); //���ϰ�ü�� �ޱ�
		for(File f : files) {
			long time = f.lastModified(); //1970~����
			Date date = new Date(time); //�츮�� �ƴ� ��¥�� ����
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm"); //Date���� ����
			System.out.print(sdf.format(date));
			
			if(f.isDirectory()) { //���丮��?
				System.out.print("\t<dir>\t");
			} else {
				System.out.print("\t" + f.length() + "\t"); //�������� length() �� �� ����
			}
			System.out.println(f.getName());
		}

	}

}
