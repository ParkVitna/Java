package ch12.exam02;

public class MusicTask extends Thread { //�������� �ڽ�Ŭ���� ����

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("������ ���� �մϴ�.");
			try {
				Thread.sleep(1000);//���� �����ϴ� �����带 ��� �����. 1�� ���� �ٽ� �����ϰ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
		
	} 

}
